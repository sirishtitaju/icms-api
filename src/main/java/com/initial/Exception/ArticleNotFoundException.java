package com.initial.Exception;

public class ArticleNotFoundException extends NotFoundException {


    @Override
    public String getMessage() {
        return  "Article  is not getting not Found from the Article Not Found";
    }
}