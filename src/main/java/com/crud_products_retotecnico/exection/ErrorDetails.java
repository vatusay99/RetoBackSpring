package com.crud_products_retotecnico.exection;

import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime timeStand;
    private String message;
    private String path;
    private String errorCode;

    public ErrorDetails() {
    }

    public ErrorDetails(LocalDateTime timeStand, String message, String path, String errorCode) {
        this.timeStand = timeStand;
        this.message = message;
        this.path = path;
        this.errorCode = errorCode;
    }

    public LocalDateTime getTimeStand() {
        return timeStand;
    }

    public void setTimeStand(LocalDateTime timeStand) {
        this.timeStand = timeStand;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
