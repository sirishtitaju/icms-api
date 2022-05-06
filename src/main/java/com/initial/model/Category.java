package com.initial.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class   Category {

    private String imageUrl;
    private String name;
    private int priority;
    private ContentModerator editor;
    private long createdAt;
    private long updatedAt;

    //product
}
