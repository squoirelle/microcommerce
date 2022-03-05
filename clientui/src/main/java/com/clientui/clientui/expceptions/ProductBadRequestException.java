package com.clientui.clientui.expceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProductBadRequestException extends Exception {
    public ProductBadRequestException(String messsage) {
        super(messsage);
    }
}
