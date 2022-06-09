package com.initial.controller;
import com.initial.Exception.NotFoundException;
import com.initial.model.Article;
import com.initial.model.ArticleDTO;
import com.initial.serviceImpl.ArticleServiceManager;
import com.initial.utils.Utility;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.http.*;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:8080")
@Controller("/article")
public class  ArticleController {
    //    @Named("Article")
    @Inject
    private ArticleServiceManager articleServiceManager;

    @Delete("/{providerKey}")//deleting via providerkey
    public HttpResponse<Void> delete(@PathVariable String providerKey)
    {
        articleServiceManager.deleteArticleBy(providerKey);
        return HttpResponse.ok();
    }

    @Post()
    public HttpResponse<Article> add(@Body ArticleDTO articleDTO)
    {
        System.out.println("gsm: articleAdd: " + articleDTO.toString());
        return HttpResponse.created(articleServiceManager.add(Utility.getArticle(articleDTO)) ).header("X-My-Header", "Foo");
    }
    @Post("/addDTO")
    public HttpResponse<ArticleDTO> addDTO(@Body ArticleDTO articleDTO)
    {
        return HttpResponse.ok(articleServiceManager.addArticle(articleDTO) ).header("X-My-Header", "Foo");
    }
//    @Post("/directAddArticle")
//    public HttpResponse<Article> hungryArticle(@Body Article article)
//    {
//        System.out.println(article);
//        article.toString();
//        return HttpResponse.created(articleServiceManager.add(article));
//    }


    @Produces(MediaType.APPLICATION_JSON)

    @Get("/{id}")
    public Article getArticle(@QueryValue  Integer id){

        return  articleServiceManager.getById(id).orElseThrow(()-> new NotFoundException("Article not found exception") );

//        try
//        {
//            Optional<Article> a=articleServiceManager.getById(id);
//            if (a.isPresent()) {
//
//                return HttpResponse.ok(a).header("X-My-Header", "Foo");
//            } else {
//                throw new ArticleNotFoundException();
////
//            }
//
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//            return HttpResponse.status(HttpStatus.I_AM_A_TEAPOT);
//        }

    }




//    @Get("/ByAuthorIdCategoryIdProductId")
//    public HttpResponse<Article> getAllArticle(Integer aId, Integer cId, Integer pId){
//        return  HttpResponse.ok( articleServiceManager.getArticlesByIds(aId,cId,pId) ).header("X-My-Header", "Foo").header("X-My-Header2", "Foo" );
//    }

    @Get("/ByAuthorIdAuthorLink")
    public HttpResponse<Article> getAllArticleByAuthorDetails(String authorLink, Integer authorId){
        return  HttpResponse.ok( articleServiceManager.getByAuthorLinkAndAuthorId(authorLink,authorId)).header("X-My-Header", "Foo").header("X-My-Header2", "Foo" );
    }
    @Get("/ByAuthorId")
    public HttpResponse<List<Article>> getArticleByAuthor(Integer aId){
        return  HttpResponse.ok( articleServiceManager.getArticlesByAuthorId(aId)).header("X-My-Header", "Foo").header("X-My-Header2", "Foo" );
    }
    @Get("/ByCategoryId")
    public HttpResponse<List<Article>> getAllArticleByCategory(Integer cId){
        return  HttpResponse.ok( articleServiceManager.getArticlesByCategoryId(cId) ).header("X-My-Header", "Foo").header("X-My-Header2", "Foo" );
    }
    @Get("/ByProductId")
    public HttpResponse<List<Article>> getAllArticleByProduct(Integer pId){
        return  HttpResponse.ok( articleServiceManager.getArticlesByProductId(pId) ).header("X-My-Header", "Foo").header("X-My-Header2", "Foo" );
    }
    @Get("/ByString/{id}")
    public Article getArticle(@PathVariable String id){
        return articleServiceManager.get(id);
    }

    @Get("/all")
    public HttpResponse<List<Article>> getAllArticle(){
        return  HttpResponse.ok( articleServiceManager.getArticles() ).header("X-My-Header", "Foo").header("X-My-Header2", "Foo" );
    }

    //____________________________________________ Sorted According to Descending Order of Article Id _______________________________-
    @Get("/allSorted")
    public HttpResponse<List<Article>> getSortedArticle(){
        return  HttpResponse.ok( articleServiceManager.getSortedArticle () ).header("X-My-Header", "Foo").header("X-My-Header2", "Foo" );
    }












/* testing post
    @Post
    public List<CallToActionDTO> addArticle(@Body ArticleDTO article)
    {
        System.out.println(article.getCallToActions());
        System.out.println(Utility.convertCallToActionDTOs(article.getCallToActions()));
        var yar=Utility.convertCallToActionDTOs(article.getCallToActions());
        return yar;
    }*/




    @Get("getProviderKeyAndAuthorLink")
    public Article getArticleByProviderKeyAndAuthorLink(@QueryValue String providerKey, String authorLink){
        System.out.println(providerKey+authorLink);
        return (Article) articleServiceManager.getArticleByProviderKeyAndAuthorLink(providerKey,authorLink);
    }
    @Get("getTitleAndId")
    public Article getArticleByTitleAndId(@QueryValue String title, Integer id){
        System.out.println(title+id);
        return (Article) articleServiceManager.getArticleByTitleAndId(title,id);
    }

    @Get("/getByKicker/{kicker}")
    public Article getArticleByKicker(@PathVariable String kicker){
        return (Article) articleServiceManager.getArticleByKicker(kicker);
    }
//    @Get("title/{title,providerKey}")
//    public Article getArticleByTitleAndProviderKey(@PathVariable String title,String providerKey){
//        return articleServiceManager.getByTitleAndProviderKey(title,providerKey);
//    }
//yo duita class chai lekoxena -[sonar]
    @Get("title/{t}")
    public Article getArticleByTitleAndProviderKey(@PathVariable String t){
        return articleServiceManager.getByTitle(t);
    }


    // You can also omit query parameters like:
    // @Get("/movie/ticket/{movieId}
//    @Get("/movie/ticket/{movieId}{?minPrice,maxPrice}")
//    public HttpStatus list(@Valid @RequestBean MovieTicketBean bean) {
//        return HttpStatus.OK;
//    }

    @Get(value = "bob/{name}/params")
    String getMyParam(@PathVariable String name, @Parameter String surname) {
        //int a=Integer.parseInt()
        return name + surname;
    }

//    @Get(value = "bob/{name}/params")
//    String getMyParam(String name, @QueryValue Optional<String> surname) {
//        return name + surname;
//    }
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