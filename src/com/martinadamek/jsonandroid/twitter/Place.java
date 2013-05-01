package com.martinadamek.jsonandroid.twitter;

import org.codehaus.jackson.annotate.JsonProperty;

public class Place {
    public Place() {
    }

    @JsonProperty
    String id;
    @JsonProperty
    String url;
    @JsonProperty("bounding_box")
    Object boundingBox;
    @JsonProperty
    Object attributes;
    @JsonProperty("full_name")
    String fullName;
    @JsonProperty
    String name;
    @JsonProperty("country_code")
    String countryCode;
    @JsonProperty("place_type")
    String placeType;
    @JsonProperty
    String country;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(Object boundingBox) {
        this.boundingBox = boundingBox;
    }

    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
