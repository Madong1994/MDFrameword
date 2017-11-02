package org.md.framework;

/**
 * @类名: ${CLASS_NAME}
 * @包名: org.md.framework
 * @描述: 提供相关配置项常量
 * @日期: 2017/11/1 15:29
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
public interface ConfigConstant {
    String CONFIG_FILE = "mdf.properties";//配置文件

    String JDBC_DRIVER = "md.framework.jdbc.driver";
    String JDBC_URL = "md.framework.jdbc.url";
    String JDBC_USERNAME = "md.framework.jdbc.username";
    String JDBC_PASSWORD = "md.framework.jdbc.password";

    String APP_BASE_PACKAGE = "md.framework.app.base_package";
    String APP_VIEW_PATH = "md.framework.app.view_path";
    String APP_ASSET_PATH = "md.framework.app.asset_path";
}
