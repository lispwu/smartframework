package org.smart4j.framework.helper;

import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.util.ArrayUtil;
import org.smart4j.framework.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * 依赖注入助手类
 */
public class IocHelper {
    static{
        //获取所有的Bean类与Bean实例之间的映射关系
        Map<Class<?>,Object> beanMap = BeanHepler.getBeanMap();
        if(beanMap != null && beanMap.size() != 0){
            //遍历BeanMap
            for(Map.Entry<Class<?>,Object> beanEntry:beanMap.entrySet()){
                //从beanMap中获取Bean类与Bean实例
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                //获取Bean实例的成员变量
                Field[] beanFields = beanClass.getDeclaredFields();
                if(ArrayUtil.isNotEmpty(beanFields)){
                    //遍历成员变量
                    for(Field beanField : beanFields){
                        //判断BeanField中是否带有Inject注解
                        if(beanField.isAnnotationPresent(Inject.class)){
                            //获取对应的实例
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if(beanFieldInstance != null){
                                //通过反射初始化beanField的值
                                ReflectionUtil.setField(beanInstance,beanField,beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
