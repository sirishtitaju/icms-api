package com.initial.Controller;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/home")
public class ArticleController {

        @Get("/article")
        public String showArticle()
        {
            return "none";
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