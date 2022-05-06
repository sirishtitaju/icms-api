package com.initial.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class   Category {
    @Id
    private String imageUrl;
    private String name;
    private int priority;
//    private ContentModerator editor;
    private long createdAt;
    private long updatedAt;

    //product
}
