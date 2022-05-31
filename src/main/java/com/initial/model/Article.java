package com.initial.model;

import com.initial.repo.ArticleRepo;
import io.micronaut.context.annotation.Prototype;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import lombok.*;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
@Setter
@Getter
@AllArgsConstructor
@Prototype
@Introspected
@Builder
@ToString
@Entity
@Table(name = "article")
public class Article  {
        @Id
        private Integer id;
        private String providerKey;
        private String content;
        private String title;
        private String summary;
    //    @Column(name = "imageIconCover")
        private String imageIconCover;
        private String kicker;
        private String audioLink;
        private String videoLink;
        private String authorPic;
        private String authorLink;
        private String audioTitle;
        private String audioSubTitle;
        private long publishedTimeStamp;

        private Integer productId;
        private Integer categoryId;
        private Integer authorId;


        public Article() {
        }

        @OneToMany
        @LazyCollection(LazyCollectionOption.FALSE)
        @Cascade(org.hibernate.annotations.CascadeType.ALL)
        private List<CallToAction> callToActions;

        @OneToMany
        @Cascade(org.hibernate.annotations.CascadeType.ALL)
        @LazyCollection(LazyCollectionOption.FALSE)
        private List<CarouselUrl> carousels;


    /*
        public Article(Integer id, String providerKey, String content, String title, String summary, String imageIconCover, String kicker, String audioLink, String videoLink, String authorPic, String authorLink, String audioTitle, String audioSubTitle, long publishedTimeStamp, List<CallToAction> callToActions, List<CarouselUrl> carousels,
            Integer productId,
                    Integer categoryId,
                    Integer authorId

        ) {
            this.id = id;
            this.providerKey = providerKey;
            this.content = content;
            this.title = title;
            this.summary = summary;
            this.imageIconCover = imageIconCover;
            this.kicker = kicker;
            this.audioLink = audioLink;
            this.videoLink = videoLink;
            this.authorPic = authorPic;
            this.authorLink = authorLink;
            this.audioTitle = audioTitle;
            this.audioSubTitle = audioSubTitle;
            this.publishedTimeStamp = publishedTimeStamp;
            this.callToActions = callToActions;
            this.carousels = carousels;
           this.productId = productId;
          this.authorId = authorId;

        }




        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getProviderKey() {
            return providerKey;
        }

        public void setProviderKey(String providerKey) {
            this.providerKey = providerKey;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getImageIconCover() {
            return imageIconCover;
        }

        public void setImageIconCover(String imageIconCover) {
            this.imageIconCover = imageIconCover;
        }

        public String getKicker() {
            return kicker;
        }

        public void setKicker(String kicker) {
            this.kicker = kicker;
        }

        public String getaudioLink() {
            return audioLink;
        }

        public void setaudioLink(String audioLink) {
            this.audioLink = audioLink;
        }

        public String getvideoLink() {
            return videoLink;
        }

        public void setvideoLink(String videoLink) {
            this.videoLink = videoLink;
        }

        public String getAuthorPic() {
            return authorPic;
        }

        public void setAuthorPic(String authorPic) {
            this.authorPic = authorPic;
        }

        public String getAuthorLink() {
            return authorLink;
        }

        public void setAuthorLink(String authorLink) {
            this.authorLink = authorLink;
        }

        public String getaudioTitle() {
            return audioTitle;
        }

        public void setaudioTitle(String audioTitle) {
            this.audioTitle = audioTitle;
        }

        public String getaudioSubTitle() {
            return audioSubTitle;
        }

        public void setaudioSubTitle(String audioSubTitle) {
            this.audioSubTitle = audioSubTitle;
        }

        public long getPublishedTimeStamp() {
            return publishedTimeStamp;
        }

        public void setPublishedTimeStamp(long publishedTimeStamp) {
            this.publishedTimeStamp = publishedTimeStamp;
        }

        public List<CallToAction> getCallToActions() {
            return callToActions;
        }

        public void setCallToActions(List<CallToAction> callToActions) {
            this.callToActions = callToActions;
        }

        public List<CarouselUrl> getCarousels() {
            return carousels;
        }

        public void setCarousels(List<CarouselUrl> carousels) {
            this.carousels = carousels;
        }*/


}
