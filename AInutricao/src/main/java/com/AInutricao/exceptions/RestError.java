package com.AInutricao.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RestError {

    private int status;
    private String message;
    private String details;

    public RestError(int status, String message) {
        this.status = status;
        this.message = message;
        this.details = "";
    }
}
