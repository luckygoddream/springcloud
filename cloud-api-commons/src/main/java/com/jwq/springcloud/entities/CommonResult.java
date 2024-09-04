package com.jwq.springcloud.entities;

import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONObject;
import com.jwq.springcloud.Enum.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author jwq
 * @Date 2020/7/24 11:04
 */
@Data
@AllArgsConstructor//作用是生成一个带着所有参数的构造函数
@NoArgsConstructor//作用是生成一个无参的构造函数
public class CommonResult<T> {
    /**
     * 业务状态码
     */
    private Integer code;

    /**
     * 消息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    /**
     * 时间戳
     */
    private long timestamp;


    public CommonResult(int code, String message) {
        this.code = code;
        this.message = message;
        this.timestamp = DateUtil.currentSeconds();
    }

    public CommonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = DateUtil.currentSeconds();
    }

    public CommonResult(T data) {
        this.code = ExceptionEnum.SUCCESS.getCode();
        this.message = ExceptionEnum.SUCCESS.getMsg();
        this.data = data;
        this.timestamp = DateUtil.currentSeconds();
    }

    public CommonResult(T data, String d) {
        this.code = ExceptionEnum.SUCCESS.getCode();
        this.message = ExceptionEnum.SUCCESS.getMsg();
        this.data = data;
        this.timestamp = DateUtil.currentSeconds();
    }

    public static <T> CommonResult<T> success() {
        return new CommonResult(new JSONObject());
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(data);
    }

    public static <T> CommonResult<T> success(T data, String d) {
        return new CommonResult<>(data, d);
    }

    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult(message);
    }

}

