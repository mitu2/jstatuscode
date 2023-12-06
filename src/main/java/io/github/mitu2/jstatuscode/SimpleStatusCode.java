package io.github.mitu2.jstatuscode;

public enum SimpleStatusCode implements StatusCode {

    SUCCESS("00000", "成功"),
    UNKNOWN("99999", "未知问题"),
    ;

    final String statusCode;
    final String description;

    SimpleStatusCode(String statusCode, String description) {
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
