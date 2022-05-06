package com.initial.services;

import com.initial.model.Article;

import java.util.List;

public interface ArticleService {

    Article addArticle(Article article);


    Article updateArticle(Article article);


    boolean deleteArticleBy(String providerKey);


    Article findArticleBy(String providerKey);


    boolean publishArticle(String providerKey);

    List<Article> getPublishedArticle();

    List<Article>  getDraftArticle();

    //recent articles

    //getAllArticles

    //getArticleByAuthorId  --> least

    //getArticleByProductId



    //getArticleByProductIdandCategoryId

    //getArticleByProductIdandCategoryIdandAuthorId  --> least priority


}
