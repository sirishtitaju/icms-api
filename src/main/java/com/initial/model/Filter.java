package com.initial.model;


import lombok.ToString;

import java.util.List;
@ToString
public class Filter {
 private List<String> countryNotInList;
 private List<String> countryInList;
 private List<String>  platform;

 public List<String> getCountryNotInList() {
  return countryNotInList;
 }

 public void setCountryNotInList(List<String> countryNotInList) {
  this.countryNotInList = countryNotInList;
 }

 public List<String> getCountryInList() {
  return countryInList;
 }

 public void setCountryInList(List<String> countryInList) {
  this.countryInList = countryInList;
 }

 public List<String> getPlatform() {
  return platform;
 }

 public void setPlatform(List<String> platform) {
  this.platform = platform;
 }
}

/*
* class CTALink
*     web,andrid,ios, Tracker tracker
*
*
*   class Tracker
*       impression, click
* */
