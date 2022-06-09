package com.initial.serviceImpl;

import com.initial.model.Author;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@MicronautTest
class AuthorServiceManagerTest {
    @Inject
    AuthorServiceManager authorServiceManager;
    @Test()
    public void addTest() {
        Author actualA= Author.builder()
                .authorName("author1")
                .authorProfile("authorProfileOne")
                .description("authorDescription")
                .build();
        Author authorResponse = authorServiceManager.add(actualA);
        log.debug("author after created", authorResponse);

        Author expectedAuthor = authorServiceManager.getAuthor(authorResponse.getId()).get();

       // assertTrue(actualA.getAuthorName()).isEqualToComparingFieldByField(expectedAuthor.getAuthorName());
        assertEquals(actualA.getAuthorName(),expectedAuthor.getAuthorName());
        assertTrue(actualA.getAuthorProfile().equals(expectedAuthor.getAuthorProfile()));


    }





}