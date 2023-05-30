package com.crio.starter.exceptions;

import org.springframework.http.HttpStatus;

/**
 * This exception must be thrown when a user tries to access a meme post that is not available in the database.
 */

public class PostNotFoundException extends ApplicationError{
    
    private static final String DEFAULT_MESSAGE = "The post you searched for is not found!";

    public PostNotFoundException() {
        super(DEFAULT_MESSAGE, HttpStatus.CONFLICT);
    }

    public PostNotFoundException(String messageString) {
        super(messageString, HttpStatus.CONFLICT);
    }
}
