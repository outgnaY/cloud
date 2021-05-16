package com.sy.common.core.constant;

import java.net.HttpURLConnection;

/**
 * 业务错误码
 */
public enum ErrorCode {

    /**
     * http相关错误
     */
    SUCCESS(HttpURLConnection.HTTP_OK, "成功"),

    BAD_REQUEST(HttpURLConnection.HTTP_BAD_REQUEST, "参数格式错误"),

    UNAUTHORIZED(HttpURLConnection.HTTP_UNAUTHORIZED, "未授权"),

    FORBIDDEN(HttpURLConnection.HTTP_FORBIDDEN, "访问受限"),

    NOT_FOUND(HttpURLConnection.HTTP_NOT_FOUND, "资源未找到"),

    INTERNAL_ERROR(HttpURLConnection.HTTP_INTERNAL_ERROR, "服务器内部出错"),

    /**
     * 业务相关错误
     */
    /**
     * 通用错误
     */
    GENERAL_ERROR(-1, "出错"),

    DATA_NOT_FOUND(10001, "找不到数据"),

    /**
     * sentinel限流
     */
    SENTINEL_BLOCK(20001,  "sentinel限流控制"),

    /**
     * sentinel失败
     */
    SENTINEL_FALLBACK(20002, "sentinel失败");


    private int errorCode;

    private String errorMsg;

    private ErrorCode(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

}
