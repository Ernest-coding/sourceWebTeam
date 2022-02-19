package com.example.sourcewebteam.controller.ex;

public class PostNotFound extends RuntimeException{
    public PostNotFound() {
        super();
    }

    public PostNotFound(String message) {
        super(message);
    }

    public PostNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public PostNotFound(Throwable cause) {
        super(cause);
    }

    protected PostNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
