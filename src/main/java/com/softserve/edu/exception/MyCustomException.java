package com.softserve.edu.exception;

public class MyCustomException extends RuntimeException {
    public MyCustomException() {
    }

    public MyCustomException(String message) {
        super(message);
    }
}
