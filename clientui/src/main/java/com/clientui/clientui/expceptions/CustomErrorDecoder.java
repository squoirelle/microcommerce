package com.clientui.clientui.expceptions;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    private ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String invoquer, Response response) {
        if(response.status() == 400) {
            return new ProductBadRequestException("Requète incorrecte");
        }

        return defaultErrorDecoder.decode(invoquer, response);
    }
}
