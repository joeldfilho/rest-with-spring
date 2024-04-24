package br.com.joeltreinos.restwithspring.Exceptions;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

public class ExceptionResponse implements Serializable{

    private static final long serialVersionUID = 1L;

    private Date timestamp;
    private String message;
    private String details;
    public ExceptionResponse(String message, String details) {
        this.timestamp = Date.from(Instant.now());
        this.message = message;
        this.details = details;
    }
    
    public Date getTimestamp() {
        return timestamp;
    }
    public String getMessage() {
        return message;
    }
    public String getDetails() {
        return details;
    }
    
    
}
