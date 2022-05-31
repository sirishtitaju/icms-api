package com.initial.model;

import io.micronaut.context.annotation.Prototype;
import io.micronaut.core.annotation.Introspected;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Prototype
@Introspected
@ToString
@Builder
public class ArticleDTO {//json ma vako harek field yeta hunu parxa

    private int id;
    private String providerKey;
    @Size(max = 2)
    private String title;

    private Integer productId;
    private Integer categoryId;
    private Integer authorId;

    private String summary;
    private String content;//
    private String imageIconCover;
    private String author;//
    private String kicker;
    private String audioLink;
    private String videoLink;
    private String authorPic;
    private String authorLink;
    private long publishedTimeStamp;
    private String audioTitle;
    private String audioSubTitle;

    private List<CallToAction> callToActions;
//    private List<CarouselUrl> carousels;





}
