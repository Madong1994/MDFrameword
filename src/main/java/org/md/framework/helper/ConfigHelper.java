package org.md.framework.helper;

import org.md.framework.ConfigConstant;

import java.util.Properties;

/**
 * @类名: ${CLASS_NAME}
 * @包名: org.md.framework.helper
 * @描述: 属性文件助手类
 * @日期: 2017/11/1 15:40
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
public final class ConfigHelper {
    private static final Properties CONFIG_PROPS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);
}
