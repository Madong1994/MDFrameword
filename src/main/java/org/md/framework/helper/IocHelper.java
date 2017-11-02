package org.md.framework.helper;


import org.apache.commons.collections.CollectionUtils;
import org.md.framework.annotaion.Inject;
import org.md.framework.util.ArrayUtil;
import org.md.framework.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @类名: ${CLASS_NAME}
 * @包名: org.md.framework.helper
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @日期: 2017/11/2 16:59
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
public final class IocHelper {
    static {
        Map<Class<?>,Object> beanMap = BeanHelper.getBeanMap();
        if(CollectionUtils.isNotEmpty(beanMap)){
            for(Map.Entry<Class<?>,Object> beanEntity: beanMap.entrySet()){
                /*获取map中的bean类与bean实例*/
                Class<?> beanClass = beanEntity.getKey();
                Object beanInstance = beanEntity.getValue();
                /*获取bean类定义的所有成员变量*/
                Field[] beanFields = beanClass.getDeclaredFields();
                if(ArrayUtil.isNotEmpty(beanFields)){
                    for(Field field : beanFields){
                        /*判断当前字段是否带有Inject注解*/
                        if(field.isAnnotationPresent(Inject.class)){
                            //在beanMap中获取bean Field对应的实例
                            Class<?> beanFieldClass = field.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if(beanFieldInstance != null){
                                //通过反射初始化BeanField的值
                                ReflectionUtil.setField(beanInstance,field,beanFieldInstance);
                            }
                        }

                    }
                }
            }
        }
    }
}
