package com.xiaoma.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private Integer code; // 状态码
    private String message; // 消息
    private T data; // 数据

    // 成功的静态方法
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "success", data);
    }

    // 成功且无数据的静态方法
    public static <T> Result<T> success() {
        return new Result<>(200, "success", null);
    }

    // 失败的静态方法
    public static <T> Result<T> error(Integer code, String message) {
        return new Result<>(code, message, null);
    }

    // 失败且使用默认状态码的静态方法
    public static <T> Result<T> error(String message) {
        return new Result<>(500, message, null);
    }
}