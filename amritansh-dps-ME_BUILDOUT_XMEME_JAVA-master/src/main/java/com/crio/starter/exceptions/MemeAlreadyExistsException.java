
package com.crio.starter.exceptions;

import org.springframework.http.HttpStatus;

/**
 * This exception should be thrown when a user tries to post an invalid meme.
 */


public class MemeAlreadyExistsException extends ApplicationError{
    
    private static final String DEFAULT_MESSAGE = "meme already exists"; 

    public MemeAlreadyExistsException() {
        super(DEFAULT_MESSAGE, HttpStatus.CONFLICT);
    }

    public MemeAlreadyExistsException(String messageString) {
        super(messageString, HttpStatus.CONFLICT);
    }
}