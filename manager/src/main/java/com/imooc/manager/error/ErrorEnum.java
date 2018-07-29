package com.imooc.manager.error;


/**
 * 错误种类
 */
public enum  ErrorEnum {

    IS_NOT_NULL("F001","编号不能为为空",false),
    UNKNOWN("F999","未知错误",false);

    private String code;
    private String message;
    private boolean canRetry;

    ErrorEnum(String code, String message, boolean canRetry) {
        this.code = code;
        this.message = message;
        this.canRetry = canRetry;
    }

    public static ErrorEnum getByCode(String code){

        for (ErrorEnum errorEnum : ErrorEnum.values()) {
            if (errorEnum.code.equals(code)){
                return errorEnum;
            }
        }

        return UNKNOWN;
        
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isCanRetry() {
        return canRetry;
    }

}
