package org.md.framework.helper;

import org.md.framework.annotaion.Controller;
import org.md.framework.annotaion.Service;
import org.md.framework.util.ClassUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * @类名: ${CLASS_NAME}
 * @包名: org.md.framework.helper
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @日期: 2017/11/2 15:55
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
public final class ClassHelper {
    /**
     * 用于存放所有加载的类
     */
    private static final Set<Class<?>> CLASS_SET;

    static {
        String basePackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = ClassUtil.getClassSet(basePackage);
    }

    /**
     * 获取所有类
     * @return
     */
    public static Set<Class<?>> getClassSet(){
        return CLASS_SET;
    }

    /**
     * 获取所有service类
     * @return
     */
    public static Set<Class<?>> getServiceClassSet(){
        Set<Class<?>> classSet = new HashSet<Class<?>>();

        for(Class<?> cls :CLASS_SET){
            if(cls.isAnnotationPresent(Service.class)){
                classSet.add(cls);
            }
        }
        return classSet;
    }

    /**
     * 获取所有Controller类
     * @return
     */
    public static Set<Class<?>> getControllerClassSet(){
        Set<Class<?>> classSet = new HashSet<Class<?>>();

        for(Class<?> cls :CLASS_SET){
            if(cls.isAnnotationPresent(Controller.class)){
                classSet.add(cls);
            }
        }
        return classSet;
    }
    public static Set<Class<?>> getBeanClassSet(){
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        classSet.addAll(getServiceClassSet());
        classSet.addAll(getControllerClassSet());
        return classSet;
    }
}
