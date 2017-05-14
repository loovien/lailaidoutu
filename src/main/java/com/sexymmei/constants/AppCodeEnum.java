package com.sexymmei.constants;

/**
 * Created by luowen on 2017/5/14.
 */
public enum AppCodeEnum {

    VALIDATE_ERROR(100, "参数验证失败"),
    ;

    private int code;

    private String message;

    AppCodeEnum(int code, String message) {
        this.setCode(code);
        this.setMessage(message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
