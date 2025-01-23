package com.crud_products_retotecnico.exection;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExcetion extends RuntimeException {

    private String message;
    public ResourceNotFoundExcetion(String message){
        super(message);
        this.message = message;
    }
}
