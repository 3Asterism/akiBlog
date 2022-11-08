package com.akisan.akiblog.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

@Data
public class businessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     * 异常对应的返回码
     */
    private Integer code;

    /**
     * 异常对应的描述信息
     */
    private String message;

    private Throwable throwable;

    public businessException() {
        super();
    }

    public businessException(String message) {
        super(message);
        this.message = message;
    }

    public businessException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public businessException(String message, Throwable cause) {
        super(message, cause);
        this.message = String.format("%s %s", message, cause.getMessage());
    }

    public businessException(int code, String message, Throwable throwable) {
        super(message);
        this.code = code;
        this.message = message;
        this.throwable = throwable;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}