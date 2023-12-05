package io.github.mitu2.jstatuscode;

final class SuccessStatusCode implements StatusCode {

    private final static String SUCCESS_CODE = "00000";
    private final static String SUCCESS_DESCRIPTION = "成功";

    static SuccessStatusCode INSTANCE = new SuccessStatusCode();

    private SuccessStatusCode() {

    }

    @Override
    public String getStatusCode() {
        return SUCCESS_CODE;
    }

    @Override
    public String getDescription() {
        return SUCCESS_DESCRIPTION;
    }
}
