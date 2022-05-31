package com.initial.model;

import lombok.Builder;
import lombok.ToString;

import javax.persistence.Id;

@ToString
@Builder
public class CallToActionDTO {
    private long id;
    private String name;
    private String type;
    private Filter filter;
    private CTALink ctaLink;

}
