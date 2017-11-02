package org.md.framework.bean;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @类名: ${CLASS_NAME}
 * @包名: org.md.framework.bean
 * @描述: 封装请求消息
 * @日期: 2017/11/2 17:16
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
public class Request {
    /**
     * 请求方法
     */
    private String requestMethod;
    /**
     * 请求路劲
     */
    private String requestPath;

    public Request(String requestMethod,String requestPath){
        this.requestMethod = requestMethod;
        this.requestPath = requestPath;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public String getRequestPath() {
        return requestPath;
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this,obj);
    }
}
