package org.md.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @类名: ${CLASS_NAME}
 * @包名: org.md.framework.util
 * @描述: 反射工具类
 * @日期: 2017/11/2 16:22
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
public final class ReflectionUtil {
    private static final Logger log = LoggerFactory.getLogger(ReflectionUtil.class);

    /**
     * 创建实例
     * @param cls
     * @return
     */
    public static Object newInstance(Class<?> cls){
        Object instance;

        try {
            instance = cls.newInstance();
        } catch (Exception e) {
            log.error("new instance failure",e);
            throw new RuntimeException(e);
        }
        return instance;
    }

    /**
     * 调用方法
     * @param obj
     * @param method
     * @param args
     * @return
     */
    public static Object invokeMethod(Object obj, Method method,Object... args){
        Object result;
        method.setAccessible(true);
        try {
            result = method.invoke(obj,args);
        } catch (Exception e) {
            log.error("invoke method failure",e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * 设置成员变量的值
     * @param obj
     * @param field
     * @param value
     */
    public static void setField(Object obj, Field field ,Object value){
        field.setAccessible(true);
        try {
            field.set(obj,value);
        } catch (IllegalAccessException e) {
            log.error("set field failure",e);
            throw new RuntimeException(e);
        }
    }
}
