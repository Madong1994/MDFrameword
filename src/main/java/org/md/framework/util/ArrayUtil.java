package org.md.framework.util;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;

/**
 * @类名: ${CLASS_NAME}
 * @包名: org.md.framework.util
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @日期: 2017/11/2 17:06
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
public final class ArrayUtil {
    /**
     * 判断数组是否非空
     * @param arry
     * @return
     */
    public static boolean isNotEmpty(Object[] arry){
        return !ArrayUtils.isEmpty(arry);
    }

    /**
     * 判断数组是否为空
     * @param arry
     * @return
     */
    public static boolean isEmpty(Object[] arry){
        return ArrayUtils.isEmpty(arry);
    }
}
