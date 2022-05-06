package com.initial.Controller;


import com.initial.model.Article;
import com.initial.services.ArticleService;
import com.initial.services.AuthorService;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Controller("/home")
public class ArticleController {
    @Inject
    @Named("Article")
    private ArticleService service;


    @Post("/add_article")
        public Article AddArticle(@Body Article article)
        {
            return  service.addArticle(article);
        }
    }







/*

class ArticleNotFoundException extends Exception{


}
*    httpfilter-->controller --> service ---> repo --> db
*    response <--controller <-- service <--- repo <-- db
*
* */



/*
* CRUD operation
* 1. modeling (model, entitiy)
* 2. service(abstract services --> interface)
* 3. Respository(persistance logic )
* 4. Service Implementation (Business logic --> call to repo, service validation)
* 5. Controller(controller validation)
* 6. HttpFilter(incoming request filter, "Authorization: 1234")
* 7. CustomException Handler(service level)
* 8. Unit testing
*
*
* */