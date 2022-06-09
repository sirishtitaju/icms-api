package com.initial.exceptionHandler;

import com.initial.Exception.NotFoundException;
import io.micronaut.context.annotation.Prototype;
import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.server.exceptions.ExceptionHandler;


@Requires(classes = {NotFoundException.class, OutOfStockExceptionHandler.class})
@Prototype
public class OutOfStockExceptionHandler implements ExceptionHandler<NotFoundException, HttpResponse> {

    @Override
    public HttpResponse handle(HttpRequest request, NotFoundException exception) {
        return HttpResponse.notFound(exception.getMessage());
    }

}