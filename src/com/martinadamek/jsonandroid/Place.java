package com.martinadamek.jsonandroid;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;
import net.vvakame.util.jsonpullparser.annotation.JsonModel;
import net.vvakame.util.jsonpullparser.util.JsonHash;

@JsonModel

public class Place {
    @JsonKey
    String id;
    @JsonKey
    String url;
    @JsonKey("bounding_box")
    JsonHash boundingBox;
    @JsonKey
    JsonHash attributes;
    @JsonKey("full_name")
    String fullName;
    @JsonKey
    String name;
    @JsonKey("country_code")
    String countryCode;
    @JsonKey("place_type")
    String placeType;
    @JsonKey
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

    public JsonHash getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(JsonHash boundingBox) {
        this.boundingBox = boundingBox;
    }

    public JsonHash getAttributes() {
        return attributes;
    }

    public void setAttributes(JsonHash attributes) {
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
