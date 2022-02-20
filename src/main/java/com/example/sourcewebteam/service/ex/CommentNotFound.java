package com.example.sourcewebteam.service.ex;

public class CommentNotFound extends ServiceException{
    public CommentNotFound() {
        super();
    }

    public CommentNotFound(String message) {
        super(message);
    }

    public CommentNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public CommentNotFound(Throwable cause) {
        super(cause);
    }

    protected CommentNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
