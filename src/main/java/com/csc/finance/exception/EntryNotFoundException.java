package com.csc.finance.exception;

public class EntryNotFoundException extends RuntimeException {

    public EntryNotFoundException() {
        super();
    }

    public EntryNotFoundException(String message) {
        super(message);
    }

    public EntryNotFoundException(String message, Throwable ex) {
        super(message, ex);
    }
}
