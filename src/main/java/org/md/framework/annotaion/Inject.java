package org.md.framework.annotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @类名: ${CLASS_NAME}
 * @包名: org.md.framework.annotaion
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @日期: 2017/11/2 15:54
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
}
