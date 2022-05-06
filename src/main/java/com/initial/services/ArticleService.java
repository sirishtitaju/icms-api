package com.initial.services;

import com.initial.model.Article;

import java.util.List;

public interface ArticleService {

    List<Article> getPublishedArticle();

    List<Article>  getDraftArticle();

    Article addArticle(Article article);


    Article updateArticle(Article article);


    boolean deleteArticleBy(String providerKey);


    Article findArticleBy(String providerKey);


    boolean publishArticle(String providerKey);



    //recent articles

    //getAllArticles

    //getArticleByAuthorId  --> least

    //getArticleByProductId



    //getArticleByProductIdandCategoryId

    //getArticleByProductIdandCategoryIdandAuthorId  --> least priority


}
