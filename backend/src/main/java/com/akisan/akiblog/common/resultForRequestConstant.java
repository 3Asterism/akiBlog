package com.akisan.akiblog.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class resultForRequestConstant {

    private Integer code;

    private String msg;

    private Object data;


    public static resultForRequestConstant success() {
        return new resultForRequestConstant(errorConstants.CODE_200,"operationPass",null);
    }

    public static resultForRequestConstant systemError() {
        return new resultForRequestConstant(errorConstants.CODE_400,"",null);
    }

    public static resultForRequestConstant powerError() {
        return new resultForRequestConstant(errorConstants.CODE_401,"",null);
    }

    public static resultForRequestConstant parameterError() {
        return new resultForRequestConstant(errorConstants.CODE_402,"",null);
    }

}
