package com.jwq.springcloud.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionEnum {
    SUCCESS(0, "success"),
    OK(0, "OK");


    private final int code;
    private final String msg;

    public String format(Object... args) {
        return String.format(this.msg, args);
    }

}
