package com.akisan.akiblog.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class resultForRequest {

    private String code;

    private String msg;

    private Object data;


    public static resultForRequest success() {
        return new resultForRequest(errorConstants.CODE_200,"",null);
    }

    public static resultForRequest systemError() {
        return new resultForRequest(errorConstants.CODE_400,"",null);
    }

    public static resultForRequest powerError() {
        return new resultForRequest(errorConstants.CODE_401,"",null);
    }

    public static resultForRequest parameterError() {
        return new resultForRequest(errorConstants.CODE_402,"",null);
    }

}
