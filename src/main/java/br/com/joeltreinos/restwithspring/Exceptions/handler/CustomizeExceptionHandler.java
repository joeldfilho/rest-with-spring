package br.com.joeltreinos.restwithspring.Exceptions.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.joeltreinos.restwithspring.Exceptions.ExceptionResponse;
import br.com.joeltreinos.restwithspring.Exceptions.UnsupportedMathOperationException;

@ControllerAdvice
@RestController
public class CustomizeExceptionHandler extends ResponseEntityExceptionHandler{

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleAllExceptions(
        Exception ex, WebRequest webRequest
    ){
        ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @ExceptionHandler(UnsupportedMathOperationException.class)
    public final ResponseEntity<ExceptionResponse> handleBadRequestException(
        Exception ex, WebRequest webRequest
    ){
        {
            ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(), webRequest.getDescription(false));
            return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
