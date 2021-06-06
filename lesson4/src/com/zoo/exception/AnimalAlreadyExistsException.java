package com.zoo.exception;

public class AnimalAlreadyExistsException extends Exception {
    public AnimalAlreadyExistsException(String message) {
        super(message);
    }
}
