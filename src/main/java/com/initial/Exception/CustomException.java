package com.initial.Exception;

import com.initial.exceptionHandler.OutOfStockExceptionHandler;
import io.micronaut.context.annotation.Prototype;
import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.server.exceptions.ExceptionHandler;

import javax.validation.ConstraintViolationException;

/***
 User
 ***/
public class CustomException extends RuntimeException {
    public HttpStatus status;
    public CustomException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    @Requires(classes = {CustomException.class, com.initial.exceptionHandler.OutOfStockExceptionHandler.class, ConstraintViolationException.class})
    @Prototype
    public static class OutOfStockExceptionHandler implements ExceptionHandler<CustomException, HttpResponse> {
        @Override
        public HttpResponse handle(HttpRequest request, CustomException exception) {
            return HttpResponse.status(exception.status).body(exception.getMessage());
        }
    }

    // Exceptional handler
}
