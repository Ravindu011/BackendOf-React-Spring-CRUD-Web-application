package com.REACTandSpring.SpringBackend.Exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Could not found.!");
    }
}
