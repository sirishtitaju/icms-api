//package com.initial.factory;
//
//import com.initial.model.Article;
//import com.initial.repo.ArticleRepo;
//import com.initial.serviceImpl.ArticleServiceManager;
//import com.initial.services.ArticleService;
//import io.micronaut.context.annotation.Bean;
//import io.micronaut.context.annotation.Factory;
//import jakarta.inject.Singleton;
//
//import javax.validation.Valid;
//import javax.validation.constraints.NotNull;
//import java.util.Optional;
//
//@Factory
//public class ArticleFactory {
//
//    @Bean
//    @Singleton
//    public ArticleService getArticleService() {
//        return new ArticleServiceManager();
//    }
//}
