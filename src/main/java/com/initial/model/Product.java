package com.initial.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@ToString
public class Product {

/*    @GeneratedValue(generator = "UUID", strategy = GenerationType.AUTO)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;
    private boolean published;
    private String name;
    private String imageUrl;
    private String description;
    private int priority;
//    private ContentModerator editor;
    private long createdAt;
    private long updatedAt;
//    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
//    private List<Category> categoryList;
}
