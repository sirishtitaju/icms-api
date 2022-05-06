package com.initial.factory;

import com.initial.model.Article;
import com.initial.services.ArticleService;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;

@Factory
public class ArticleFactory {

    @Bean
    @Singleton
    public ArticleService getArticle() {
        return (ArticleService) new Article();
    }
}
