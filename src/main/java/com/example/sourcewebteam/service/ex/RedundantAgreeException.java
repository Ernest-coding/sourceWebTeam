package com.example.sourcewebteam.service.ex;

public class RedundantAgreeException extends ServiceException{
    public RedundantAgreeException() {
        super();
    }

    public RedundantAgreeException(String message) {
        super(message);
    }

    public RedundantAgreeException(String message, Throwable cause) {
        super(message, cause);
    }

    public RedundantAgreeException(Throwable cause) {
        super(cause);
    }

    protected RedundantAgreeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
