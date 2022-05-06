package com.initial.model;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Builder
public class Product {
    @Id
    private String key;
    private String name;
    private String imageUrl;
    private String description;
    private int priority;
//    private ContentModerator editor;
    private long createdAt;
    private long updatedAt;


    public Product() {

    }
}
