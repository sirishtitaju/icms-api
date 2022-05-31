package com.initial.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Category {

/*
    @GeneratedValue(generator = "UUID", strategy = GenerationType.AUTO)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long categoryId;//Type Migration if want to change your Integer/Long or any Wrapper Class
    private String imageUrl;
    private String name;
    private int priority;
    private long createdAt;
    private long updatedAt;
    private long productId;

    @ManyToOne
    private Product product;
}
