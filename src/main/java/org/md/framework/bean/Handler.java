package org.md.framework.bean;

import java.lang.reflect.Method;

/**
 * @类名: ${CLASS_NAME}
 * @包名: org.md.framework.bean
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @日期: 2017/11/2 17:26
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
public class Handler {

    private Class<?> controllerClass;

    private Method actionMethon;

    public Handler(Class<?> controllerClass,Method actionMethon){
        this.actionMethon = actionMethon;
        this.controllerClass = controllerClass;
    }
    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethon() {
        return actionMethon;
    }
}
