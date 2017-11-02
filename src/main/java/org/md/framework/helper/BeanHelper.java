package org.md.framework.helper;

import org.md.framework.util.ReflectionUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @类名: ${CLASS_NAME}
 * @包名: org.md.framework.helper
 * @描述: Bean助手类
 * @日期: 2017/11/2 16:31
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
public final class BeanHelper {
    /**
     * 存放bean类与bean实例的映射
     */
    private static final Map<Class<?>,Object> BEAN_MAP = new HashMap<Class<?>, Object>();
    static {
        Set<Class<?>> beanClassSet = ClassHelper.getBeanClassSet();
        for(Class<?> beanClass :beanClassSet){
            Object obj = ReflectionUtil.newInstance(beanClass);
            BEAN_MAP.put(beanClass,obj);
        }
    }

    /**
     * 获取bean映射
     * @return
     */
    public static Map<Class<?>,Object> getBeanMap(){
        return BEAN_MAP;
    }

    /**
     * 获取bean实例
     * @param cls
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(Class<T> cls){
        if(!BEAN_MAP.containsKey(cls)){
            throw new RuntimeException("can not get bean by class:"+cls);
        }
        return (T)BEAN_MAP.get(cls);
    }
}
