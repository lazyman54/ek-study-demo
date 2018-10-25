package com.ek.study.demo.validata.exception;

import com.oppo.pay.common.domain.rsp.IResponse;
import com.oppo.pay.common.domain.rsp.ResponseBuilder;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(BindException.class)
    public IResponse handlerException(BindException ex) {

        //System.out.println(ex.getBindingResult().getFieldError().getDefaultMessage());
        return ResponseBuilder.failure("ad", "b");

    }

}
