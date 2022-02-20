package com.example.sourcewebteam.service.ex;

public class CommentTypeException extends ServiceException{
    public CommentTypeException() {
        super();
    }

    public CommentTypeException(String message) {
        super(message);
    }

    public CommentTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommentTypeException(Throwable cause) {
        super(cause);
    }

    protected CommentTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
