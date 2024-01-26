package ir.ac.hut.dbproject.exception;

import org.springframework.stereotype.Component;

public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String username) {
        super("User with username '" + username + "' Already Exists");
    }
}
