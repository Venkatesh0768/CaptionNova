package org.backend.captionnovabackend.auth.exception;

public class EmailSendingException extends RuntimeException {
    public EmailSendingException(String message, Exception e) {
        super(message);
    }
}
