package com.initial.model;


import lombok.Builder;

@Builder
public class CarouselUrlDTO {
    private long id;
    private String name;
    private String carouselUrl;
    private Filter filter;

}
