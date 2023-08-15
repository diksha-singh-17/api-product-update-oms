package com.sc.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime timeStamp;
    private String message;

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public ErrorDetails(LocalDateTime timeStamp, String message) {
        this.timeStamp = timeStamp;
        this.message = message;
    }


    @Override
    public String toString() {
        return "ErrorDetails{" +
                "timeStamp=" + timeStamp +
                ", message='" + message + '\'' +
                '}';
    }
}
