package com.biocipher.group.horizon.util;

public class ApplicationException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public ApplicationException(String msg, Throwable cause)
    {
        super(msg, cause);
    }

    public ApplicationException(String msg)
    {
        super(msg);
    }
}
