package com.initial.utils;

import com.initial.model.*;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpResponse;

import java.util.ArrayList;
import java.util.List;

public class Utility {

    public static ArticleDTO getArticleDTO(Article article){
      return ArticleDTO.builder()
              .providerKey(article.getProviderKey())
              .content(article.getContent())
              .title(article.getTitle())
              .summary(article.getSummary())
              .imageIconCover(article.getImageIconCover())
              .kicker(article.getKicker())
              .audioLink(article.getAudioLink())
              .videoLink(article.getVideoLink())
              .authorPic(article.getAuthorPic())
              .authorLink(article.getAuthorLink())
              .audioTitle(article.getAudioTitle())
              .audioSubTitle(article.getAudioSubTitle())
              .publishedTimeStamp(article.getPublishedTimeStamp())
              .productId(article.getProductId())
              .categoryId(article.getCategoryId())
              .authorId(article.getAuthorId())
//              .carousels(article.getCarousels())
              //.callToActions(convertCallToActionDTOs(article.getCallToActions()))
              .callToActions(article.getCallToActions())
              .build();
    }

//________________________________//

    public static Author getAuthorDTO(AuthorDTO authorDTO) {
        try {
            System.out.println("_______________________________");
            return Author.builder()
                    .authorProfile(authorDTO.getAuthorProfile())
                    .authorName(authorDTO.getAuthorName())
                    .description(authorDTO.getDescription())
                    .build();
//            return HttpResponse.ok(authorServiceManager.addAuthor(author)).header("Posted Status", "True");
        } catch (Exception e) {//exception pani liyena??
            e.printStackTrace();
//               throw (new CustomException("Can't Post ",HttpStatus.BAD_REQUEST));
            return (Author) HttpResponse.badRequest().body("Author can't be black");

        }
    }



    public static Article getArticle(ArticleDTO articleDTO){
        Article article =  new Article();
        article.setId(articleDTO.getId());
        article.setProviderKey(articleDTO.getProviderKey());
        article.setContent(articleDTO.getContent());
        article.setSummary(articleDTO.getSummary());
        article.setAudioTitle(articleDTO.getAudioTitle());
        article.setImageIconCover(articleDTO.getImageIconCover());
        article.setKicker(articleDTO.getKicker());
        article.setAudioLink(articleDTO.getAudioLink());
        article.setVideoLink(articleDTO.getVideoLink());
        article.setAuthorPic(articleDTO.getAuthorPic());
        article.setAuthorLink(articleDTO.getAuthorLink());
        article.setAudioSubTitle(articleDTO.getAudioSubTitle());
        article.setTitle(articleDTO.getTitle());
        article.setPublishedTimeStamp(articleDTO.getPublishedTimeStamp());

        article.setAuthorId(articleDTO.getAuthorId());
        article.setCategoryId(articleDTO.getCategoryId());
        article.setProductId(articleDTO.getProductId());






        System.out.println("-------------------------------------------------------");
//        article.setCarousels(articleDTO.getCarousels());
        System.out.println("printing Call to action DTO and then Carousels");
//        System.out.println(articleDTO.getCarousels());
//        System.out.println(articleDTO.getCarousels().toString());

        System.out.println("-------------------------------------------------------");



//        article.setCallToActions(articleDTO.getCallToActions());
        System.out.println("printting CallToAction");
        article.setCallToActions(articleDTO.getCallToActions());
        System.out.println(articleDTO.getCallToActions());

//        System.out.println(convertCallToActionDTOs(articleDTO.getCallToActions()));



        System.out.println("-------------------------------------------------------");
        System.out.println(articleDTO);
        System.out.println(article);
        return article;
    }

    public static CarouselUrlDTO getCarouselUrlDTO(CarouselUrl carouselUrl){
       return CarouselUrlDTO.builder()
               .filter(carouselUrl.getFilter())
               .carouselUrl(carouselUrl.getCarouselUrl())
               .name(carouselUrl.getName())
               .id(carouselUrl.getId())
               .build();
    }

    public static CallToActionDTO getCallToActionDTO(CallToAction callToAction){
        return CallToActionDTO.builder()
                .filter(callToAction.getFilter())
                .ctaLink(callToAction.getCtaLink())
                .build();
    }//CallTOActionDTO Banauna ko lagi ta , firstma CtaLink and Filter banaunu parxa hainara,

    public static List<CallToActionDTO> convertCallToActionDTOs(List<CallToAction> actions){
        List<CallToActionDTO> items = new ArrayList<>();
        actions.forEach(item->{
            items.add(getCallToActionDTO(item));
        });
        return items;
    }

    public static List<CarouselUrlDTO> convertCarouselUrlDTOs(List<CarouselUrl> urls){
        List<CarouselUrlDTO> items = new ArrayList<>();
        urls.forEach(item->{
            items.add(getCarouselUrlDTO(item));
        });
        return items;
    }

    public static List<CarouselUrl> getCarouselUrls(List<CarouselUrlDTO> dtos){
        List<CarouselUrl> carousels = new ArrayList<>();
        dtos.forEach(item->{
            carousels.add(getCarouselUrl(item));
        });
        return carousels;
    }

    public static CarouselUrl getCarouselUrl(CarouselUrlDTO dto){
        return new CarouselUrl();

    }



}
