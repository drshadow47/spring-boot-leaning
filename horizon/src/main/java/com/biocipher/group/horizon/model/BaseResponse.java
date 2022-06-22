package com.biocipher.group.horizon.model;

public class BaseResponse{

    private String message;
    private int responseCode;

    public String getMessage()
    {
        return this.message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public int getResponseCode()
    {
        return this.responseCode;
    }

    public void setResponseCode(int responseCode)
    {
        this.responseCode = responseCode;
    }

}
