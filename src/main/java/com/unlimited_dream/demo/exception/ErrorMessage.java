package com.unlimited_dream.demo.exception;

public enum ErrorMessage {
    BAD_REQUEST("Bad request"),
    NOT_FOUND("Not found");

  public final String val;

    ErrorMessage(String val) {
        this.val = val;
    }
}
