package com.initial.ServiceImpl;

import com.initial.services.ArticleService;
import com.initial.model.Article;
import com.initial.repo.ArticleRepo;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class ArticleServiceManager implements ArticleService {

    @Inject
    private ArticleRepo articleRepo;


    public Article addArticle(Article article) {
        return articleRepo.save(article);
    }


    @Override
    public Article updateArticle(Article article) {
        return articleRepo.update(article);
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
