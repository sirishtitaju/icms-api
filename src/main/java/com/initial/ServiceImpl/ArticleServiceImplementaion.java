package com.initial.ServiceImpl;

import com.initial.model.Article;
import com.initial.services.ArticleService;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class ArticleServiceImplementaion implements ArticleService {

    @Override
    public Article addArticle(Article article) {
        Article article1 = Article.builder()
                .audio_link("")
                .build();
        return null;
    }

    @Override
    public Article updateArticle(Article article) {
        return null;
    }


    @Override
    public boolean deleteArticleBy(String providerKey) {
        return false;
    }

    @Override
    public Article findArticleBy(String providerKey) {
        return null;
    }

    @Override
    public boolean publishArticle(String providerKey) {
        return false;
    }

    @Override
    public List<Article> getPublishedArticle() {
        return null;
    }

    @Override
    public List<Article> getDraftArticle() {
        return null;
    }
}
