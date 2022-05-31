package com.initial.Exception;

/***
 User
 ***/
public class AurthorNotFoundException extends NotFoundException{

    @Override
    public String getMessage() {
        return "Author not Found Exception";
    }
}
