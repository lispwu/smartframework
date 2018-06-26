package org.smart4j.framework;

import org.smart4j.framework.helper.BeanHepler;
import org.smart4j.framework.helper.ClassHelper;
import org.smart4j.framework.helper.ControllerHelper;
import org.smart4j.framework.helper.IocHelper;
import org.smart4j.framework.util.ClassUtil;

public class HelperLoader {

    public static void init(){
        Class<?>[] classList ={
                ClassHelper.class,
                BeanHepler.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for(Class<?> cls:classList){
            ClassUtil.loadClass(cls.getName(),false);
        }
    }
}
