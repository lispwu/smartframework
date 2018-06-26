package org.smart4j.framework.helper;

import java.util.Properties;
import org.smart4j.framework.ConfigConstant;
import org.smart4j.framework.util.PropsUtil;

public final class ConfigHelper {
    private static final Properties CONFIG_PROPS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    /**
     * 获取JDBC驱动
     */
    public static String getJdbcDriver(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_DRIVER);
    }

    /**
     * 获取url
     * @return
     */
    public static String getJdbcUrl(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_URL);
    }

    /**
     * 获取用户名
     * @return
     */
    public static String getUserName(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_USERNAME);
    }

    /**
     * 获取密码
     * @return
     */
    public static String getPassword(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_PASSWORD);
    }

    /**
     * 获取基础包路径
     * @return
     */
    public static String getAppBasePath(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.APP_BASE_PACKAGE);
    }

    /**
     * 获取jsp路径
     * @return
     */
    public static String getAppJspPath(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.APP_JSP_PATH,"/WEB-INF/view/");
    }

    /**
     * 获取静态资源的路径
     * @return
     */
    public static String getAppAssertPath(){
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.APP_ASSERT_PATH,"/assert/");
    }
}
