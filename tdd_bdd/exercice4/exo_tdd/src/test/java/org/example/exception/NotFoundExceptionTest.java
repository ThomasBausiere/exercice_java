package org.example.exception;

public class NotFoundExceptionTest extends RuntimeException {
    public NotFoundExceptionTest(String message) {
        super(message);
    }
}
