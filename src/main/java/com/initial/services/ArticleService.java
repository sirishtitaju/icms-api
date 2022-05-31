package com.initial.services;

import com.initial.model.Article;
import com.initial.model.ArticleDTO;

import java.util.List;
import java.util.Optional;

public interface ArticleService {

    Article add(Article article);

    Article getArticlesByIds(Integer aId, Integer cId, Integer pId);

    List<Article> getPublishedArticle();

    List<Article>  getDraftArticle();


    ArticleDTO addArticle(ArticleDTO article);





    Article get(String providerkey);

    Optional<Article> getById(Integer id);




    Article updateArticle(Article article);


    boolean deleteArticleBy(String providerKey);


//    Article findArticleBy(String providerKey);

    boolean publishArticle(String providerKey);

    List<Article> getArticles();


    Article getByAuthor(String author);

//    Article getArticleByGtm(String gtm);
    Article getArticleByKicker(String kicker);
//    Article getArticleByKickerAndGtm(String kicker,String gtm);
    Article getArticleByProviderKeyAndAuthorLink(String providerKey,String authorLink);
    Article getArticleByTitleAndId(String title,Integer id);

    List<Article> getArticlesByAuthorId(Integer aId);
    List<Article> getArticlesByCategoryId(Integer cId);
    List<Article> getArticlesByProductId(Integer pId);

    //recent articles

    //getAllArticles

    //getArticleByAuthorId  --> least

    //getArticleByProductId



    //getArticleByProductIdandCategoryId

    //getArticleByProductIdandCategoryIdandAuthorId  --> least priority


}
