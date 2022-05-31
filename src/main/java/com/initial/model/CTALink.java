package com.initial.model;


import lombok.ToString;

@ToString
public class CTALink {
    private String web;
    private String ios;
    private String android;
    private Tracker tracker;

    public CTALink(String web, String ios, String android, Tracker tracker) {
        this.web = web;
        this.ios = ios;
        this.android = android;
        this.tracker = tracker;
    }

    public CTALink() {
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getIos() {
        return ios;
    }

    public void setIos(String ios) {
        this.ios = ios;
    }

    public String getAndroid() {
        return android;
    }

    public void setAndroid(String android) {
        this.android = android;
    }

    public Tracker getTracker() {
        return tracker;
    }

    public void setTracker(Tracker tracker) {
        this.tracker = tracker;
    }

    @ToString
    public static class Tracker{
        private String impression;
        private String click;

        public Tracker(String impression, String click) {
            this.impression = impression;
            this.click = click;
        }

        public Tracker() {
        }

        public String getImpression() {
            return impression;
        }

        public void setImpression(String impression) {
            this.impression = impression;
        }

        public String getClick() {
            return click;
        }

        public void setClick(String click) {
            this.click = click;
        }
    }
}


















//class CarouselUrl --> url, filter











//
//public class CTALink {
//    private String web;
//    private String ios;
//    private String android;
//    private Tracker tracker; //inner class
//
//    //webClient Filter introspect
//
//    public static class Tracker {
//        private String impression;
//        private String click;
//    }
//    private boolean sticky;
//
//
//
//    public enum Type{
//        IMAGE,
//        TEXT,
//        BUTTON,
//        NONE
//    }
//
//
//    public CTALink(String web, String ios, String android, Tracker tracker) {
//        this.web = web;
//        this.ios = ios;
//        this.android = android;
//        this.tracker = tracker;
//    }
//
//    public CTALink() {
//    }
//
//    public String getWeb() {
//        return web;
//    }
//
//    public void setWeb(String web) {
//        this.web = web;
//    }
//
//    public String getIos() {
//        return ios;
//    }
//
//    public void setIos(String ios) {
//        this.ios = ios;
//    }
//
//    public String getAndroid() {
//        return android;
//    }
//
//    public void setAndroid(String android) {
//        this.android = android;
//    }
//
//
//}