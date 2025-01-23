package com.crud_products_retotecnico.exection;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundExcetion.class)
    public ResponseEntity<ErrorDetails> handlerResourceNotFountException(
            ResourceNotFoundExcetion ex,
            WebRequest webRequest
    ){
        ErrorDetails error = new ErrorDetails(
                LocalDateTime.now(),
                ex.getMessage(),
                webRequest.getDescription(false),
                "Not Found"
                );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

    }

}
