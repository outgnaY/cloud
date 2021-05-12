package com.sy.common.core.result;

import com.sy.common.core.constant.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 返回结果
 */
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    /**
     * http状态码
     */
    @Getter
    @Setter
    private int code;

    /**
     * 说明
     */
    @Getter
    @Setter
    String message;

    /**
     * 返回数据
     */
    @Getter
    @Setter
    private T data;

    public static <T> CommonResult<T> success() {
        return new CommonResult<>(ErrorCode.SUCCESS.getErrorCode(), null, null);
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(ErrorCode.SUCCESS.getErrorCode(), null, data);
    }

    public static <T> CommonResult<T> success(String message, T data) {
        return new CommonResult<>(ErrorCode.SUCCESS.getErrorCode(), message, data);
    }

    public static <T> CommonResult<T> error() {
        return new CommonResult<>(ErrorCode.GENERAL_ERROR.getErrorCode(), null, null);
    }

    public static <T> CommonResult<T> error(String message) {
        return new CommonResult<>(ErrorCode.GENERAL_ERROR.getErrorCode(), message, null);
    }

    public static <T> CommonResult<T> error(T data) {
        return new CommonResult<>(ErrorCode.GENERAL_ERROR.getErrorCode(), null, data);
    }

    public static <T> CommonResult<T> error(String message, T data) {
        return new CommonResult<>(ErrorCode.GENERAL_ERROR.getErrorCode(), message, data);
    }

    public static <T> CommonResult<T> error(int code, String message, T data) {
        return new CommonResult<>(code, null, null);
    }

}


