package com.initial.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;
    private String authorName;
    private String authorProfile;
    private String description;

}
