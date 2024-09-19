package com.unlimited_dream.demo.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Getter
public class ExceptionResponse {
    private final Integer status;
    private final Date timestamp;
    private final String message;
    private final String description;
    private final String path;

    public ExceptionResponse(HttpStatus status, Date timestamp, String message, String description, String path) {
        super();
        this.status = status.value();
        this.timestamp = timestamp;
        this.message = message;
        this.description = description;
        this.path = path;
    }
}
