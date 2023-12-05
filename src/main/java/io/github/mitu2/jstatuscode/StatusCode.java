package io.github.mitu2.jstatuscode;

public interface StatusCode {

    String getStatusCode();

    String getDescription();

    static StatusCode success() {
        return SuccessStatusCode.INSTANCE;
    }

}
