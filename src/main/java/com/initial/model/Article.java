package com.initial.model;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
@Getter
@Builder
public class Article  {

    @Id
    private String providerKey;
    private String content;
    private String title;
    private String summary;
    private String image_icon_cover;
    private String kicker;
    private String audio_link;
    private String video_link;
    private String authorPic;
    private String authorLink;
    private String audio_title;
    private String audio_sub_title;
    private long publishedTimeStamp;

    @ManyToMany
    private List<CallToAction> callToActions;
    private List<CarouselUrl> carousels;




    //need dependency injection
   // private List<CTALink> cta;


    //please uncomment
//    private CategoryDTO categoryDTO;
//    private Author author;
//    private ProductDTO product;

    public Article() {

    }


    //audio link, au
}
