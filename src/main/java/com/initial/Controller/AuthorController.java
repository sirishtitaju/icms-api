package com.initial.Controller;

import com.initial.services.AuthorService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Controller
public class AuthorController {
//    @Inject
//    @Named("Author")
//    private AuthorService service;


    @Controller("/article")
    public class ArticleController {

        @Get("/article")
        public String showArticle()
        {
            return "none";
        }


    }

}
