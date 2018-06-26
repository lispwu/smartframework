package org.smart4j.framework.util;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayUtil {
    public static boolean isNotEmpty(Object[] arrays){
        return !ArrayUtils.isEmpty(arrays);
    }

    public static boolean isEmpty(Object[] arrays){
        return ArrayUtils.isEmpty(arrays);
    }
}
