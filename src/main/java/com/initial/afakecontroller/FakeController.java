package com.initial.afakecontroller;

import com.initial.model.Article;
import com.initial.model.ArticleDTO;
import com.initial.utils.Utility;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

/***
 User
 ***/
@Controller("/higuys")
public class FakeController {

    @Post()
    public HttpResponse<Article> add(@Body ArticleDTO articleDTO)
    {
        System.out.println("gsm: articleAdd: " + articleDTO.toString());
        return HttpResponse.created(articleServiceManager.add(Utility.getArticle(articleDTO)) ).header("X-My-Header", "Foo");
    }
}
