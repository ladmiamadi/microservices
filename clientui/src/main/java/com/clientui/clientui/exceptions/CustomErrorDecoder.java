package com.clientui.clientui.exceptions;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder  {


   /* @Override
    public Exception decode(String s, Response response) {
        if(reponse.status() == 400 ) {
            return new ProductBadRequestException(
                    "Requête incorrecte "
            );
        }
        return defaultErrorDecoder.decode(invoqueur, reponse);
    }*/
}
