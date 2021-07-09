package com.csculb;

public class CustomException extends Exception {

    String description = "This is my custom exception";

    public CustomException(String message) {
        super(message);

        this.description = message;
    }
}
