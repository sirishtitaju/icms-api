package com.initial.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ToString
@Entity
public class CallToAction {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String name;
    private CallToActionType type;//type matraxa
    private String buttonText;
    private String buttonBackgroundColor;
    private String textColor;
    private String imageUrl;
    private String text;
    private boolean isSticky;//

    //there are multile value i.e

    private String ctaLink;
    private String filter;

    public CTALink getCtaLink() {
        try {
            return new ObjectMapper().readValue(ctaLink,CTALink.class);
        } catch (JsonProcessingException e) {

        }
        return null;
    }

    public void setCtaLink(CTALink ctaLink) {
           try {
               this.ctaLink = new ObjectMapper().writeValueAsString(ctaLink);
               System.out.println("This is Cta Link");
           } catch (JsonProcessingException e) {
               e.printStackTrace();
           }
    }

    public Filter getFilter() {
        try {
            System.out.println("tisi is filter");
            return new ObjectMapper().readValue(filter,Filter.class);
        } catch (JsonProcessingException e) {

        }
        return null;
    }

    public void setFilter(Filter filter) {
        try {
            System.out.println("tisi is set filter");
            this.filter = new ObjectMapper().writeValueAsString(filter);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public String getButtonBackgroundColor() {
        return buttonBackgroundColor;
    }

    public void setButtonBackgroundColor(String buttonBackgroundColor) {
        this.buttonBackgroundColor = buttonBackgroundColor;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isSticky() {
        return isSticky;
    }

    public void setSticky(boolean sticky) {
        isSticky = sticky;
    }

    public void setType(CallToActionType type) {
        this.type = type;
    }

    public CallToActionType getType() {
        return type;
    }
    //filter
    //make seperate cclass in filters
    /*private String platform;

    private ArrayList<String> countryInList;
    private ArrayList<String> restrictedList

    private String trackerImpressionLink;
    private String trackerImpressionClick;
     */

}
