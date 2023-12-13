package io.github.mitu2.jstatuscode;

public enum ServiceStatusCode implements StatusCode {

    C0001("C0001", "调用第三方服务出错"),
    C0100("C0100", "中间件服务出错"),
    C0110("C0110", "RPC 服务出错"),
    C0111("C0111", "RPC 服务未找到"),
    C0112("C0112", "RPC 服务未注册"),
    C0113("C0113", "接口不存在"),
    C0120("C0120", "消息服务出错"),
    C0121("C0121", "消息投递出错"),
    C0122("C0122", "消息消费出错"),
    C0123("C0123", "消息订阅出错"),
    C0124("C0124", "消息分组未查到"),
    C0130("C0130", "缓存服务出错"),
    C0131("C0131", "key 长度超过限制"),
    C0132("C0132", "value 长度超过限制"),
    C0133("C0133", "存储容量已满"),
    C0134("C0134", "不支持的数据格式"),
    C0140("C0140", "配置服务出错"),
    C0150("C0150", "网络资源服务出错"),
    C0151("C0151", "VPN 服务出错"),
    C0152("C0152", "CDN 服务出错"),
    C0153("C0153", "域名解析服务出错"),
    C0154("C0154", "网关服务出错"),
    C0200("C0200", "第三方系统执行超时"),
    C0210("C0210", "RPC 执行超时"),
    C0220("C0220", "消息投递超时"),
    C0230("C0230", "缓存服务超时"),
    C0240("C0240", "配置服务超时"),
    C0250("C0250", "数据库服务超时"),
    C0300("C0300", "数据库服务出错 "),
    C0311("C0311", "表不存在"),
    C0312("C0312", "列不存在"),
    C0321("C0321", "多表关联中存在多个相同名称的列"),
    C0331("C0331", "数据库死锁"),
    C0341("C0341", "主键冲突"),
    C0400("C0400", "第三方容灾系统被触发 "),
    C0401("C0401", "第三方系统限流"),
    C0402("C0402", "第三方功能降级"),
    C0500("C0500", "通知服务出错"),
    C0501("C0501", "短信提醒服务失败"),
    C0502("C0502", "语音提醒服务失败"),
    C0503("C0503", "邮件提醒服务失败"),
    ;

    final String statusCode;
    final String description;

    ServiceStatusCode(String statusCode, String description) {
        this.statusCode = statusCode;
        this.description = description;
    }


    @Override
    public String getStatusCode() {
        return statusCode;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
