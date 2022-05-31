package com.initial.Exception;

/***
 User
 ***/

//student.initcau(new Ex)
public class NotFoundException extends RuntimeException{
    @Override
    public Throwable fillInStackTrace() {
        return super.fillInStackTrace();
    }

    @Override
    public synchronized Throwable initCause(Throwable throwable) {
        return super.initCause(throwable);
    }

    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);

    }
    public NotFoundException(int message) {
        super(String.valueOf(message));

    }
    public double calc(int a, int b)
    {
        try {
            return (double) a/b;
        } catch (ArithmeticException arithmeticException) {
            throw new NotFoundException(b);
        }
    }
}
