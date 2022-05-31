package com.initial.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.data.annotation.GeneratedValue;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
@ToString
@Entity
public class CarouselUrl {
    @Id
    private long id;
    private String name;
    private String carouselUrl;//just simple string only
    private String filter;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String  getCarouselUrl() {
      return carouselUrl;
    }

    public void setCarouselUrl(String carouselUrl) {
        this.carouselUrl = carouselUrl;
    }

    public Filter getFilter() {
        try {
            return new ObjectMapper().readValue(filter,Filter.class);
        } catch (JsonProcessingException e) {

        }
        return null;
    }

    public void setFilter(Filter filter) {
        try {
            this.filter = new ObjectMapper().writeValueAsString(filter);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
