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


        @Get("/show_author")
        public String showAuthor()
        {
            return "none";
        }



}
