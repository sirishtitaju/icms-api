package com.initial;

import com.initial.model.Article;
import com.initial.model.ArticleDTO;
import com.initial.model.Author;
import com.initial.serviceImpl.ArticleServiceManager;
import com.initial.serviceImpl.AuthorServiceManager;
import com.initial.utils.Utility;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

import javax.validation.Valid;

@MicronautTest
class Project1Test {

    @Inject
    EmbeddedApplication<?> application;
    @Inject
    private AuthorServiceManager authorServiceManager;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

    @Disabled
    @Test
    public void add()
    {
        var a=new Author().builder()
                        .authorName("Rudiyart kipling")
                                .authorProfile("sjsjsjs")
                                        .description("authorDespcript")
                                                .build();
        //assert
    }



}
