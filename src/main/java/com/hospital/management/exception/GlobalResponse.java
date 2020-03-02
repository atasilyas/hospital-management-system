package com.hospital.management.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


public class GlobalResponse {
    public GlobalResponse() {
    }

    public Date getDate() {
        return date;
    }

    public GlobalResponse(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private Date date;
    private String message;
}
