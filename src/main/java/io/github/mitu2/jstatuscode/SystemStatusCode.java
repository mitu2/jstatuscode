package io.github.mitu2.jstatuscode;

public enum SystemStatusCode implements StatusCode {

    B0001("B0001", "系统执行出错"),
    B0100("B0100", "系统执行超时"),
    B0101("B0101", "系统订单处理超时"),
    B0200("B0200", "系统容灾功能被触发"),
    B0210("B0210", "系统限流"),
    B0220("B0220", "系统功能降级"),
    B0300("B0300", "系统资源异常"),
    B0310("B0310", "系统资源耗尽"),
    B0311("B0311", "系统磁盘空间耗尽"),
    B0312("B0312", "系统内存耗尽"),
    B0313("B0313", "文件句柄耗尽"),
    B0314("B0314", "系统连接池耗尽"),
    B0315("B0315", "系统线程池耗尽"),
    B0320("B0320", "系统资源访问异常"),
    B0321("B0321", "系统读取磁盘文件失败"),
    ;

    final String statusCode;
    final String description;

    SystemStatusCode(String statusCode, String description) {
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
