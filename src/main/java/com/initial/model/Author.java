package com.initial.model;


import io.micronaut.context.annotation.Prototype;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.validation.Validated;
import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@Entity
@Builder
@ToString
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String authorName;
    private String authorProfile;
    private String description;

    public Author( String authorName, String authorProfile, String description) {
        this.authorName = authorName;
        this.authorProfile = authorProfile;
        this.description = description;
    }

    public Author() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorProfile() {
        return authorProfile;
    }

    public void setAuthorProfile(String authorProfile) {
        this.authorProfile = authorProfile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}


