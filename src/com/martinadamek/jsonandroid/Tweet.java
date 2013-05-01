package com.martinadamek.jsonandroid;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;
import net.vvakame.util.jsonpullparser.annotation.JsonModel;
import net.vvakame.util.jsonpullparser.util.JsonHash;

@JsonModel
public class Tweet {
    @JsonKey
    String text;

    @JsonKey("in_reply_to_screen_name")
    String inReplyToScreenName;

    @JsonKey("in_reply_to_status_id")
    int inReplyToStatusId;

    @JsonKey
    Place place;

    @JsonKey("in_reply_to_user_id")
    int inReplyToUserId;

    @JsonKey
    boolean retweeted;

    @JsonKey
    String source;

    @JsonKey("id_str")
    String idStr;

    @JsonKey("in_reply_to_status_id_str")
    String inReplyToStatusIdStr;

    @JsonKey
    JsonHash geo;

    @JsonKey
    JsonHash contributors;

    @JsonKey
    String inReplyToUserIdStr;

    @JsonKey("retweet_count")
    int retweetCount;

    @JsonKey
    boolean truncated;

    @JsonKey
    JsonHash coordinates;

    @JsonKey
    int id;

    @JsonKey
    boolean favorited;

    @JsonKey("created_at")
    String createdAt;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    public void setInReplyToScreenName(String inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public int getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public void setInReplyToStatusId(int inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public int getInReplyToUserId() {
        return inReplyToUserId;
    }

    public void setInReplyToUserId(int inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public boolean isRetweeted() {
        return retweeted;
    }

    public void setRetweeted(boolean retweeted) {
        this.retweeted = retweeted;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    public void setInReplyToStatusIdStr(String inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    public JsonHash getGeo() {
        return geo;
    }

    public void setGeo(JsonHash geo) {
        this.geo = geo;
    }

    public JsonHash getContributors() {
        return contributors;
    }

    public void setContributors(JsonHash contributors) {
        this.contributors = contributors;
    }

    public String getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    public void setInReplyToUserIdStr(String inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    public int getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(int retweetCount) {
        this.retweetCount = retweetCount;
    }

    public boolean isTruncated() {
        return truncated;
    }

    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    public JsonHash getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(JsonHash coordinates) {
        this.coordinates = coordinates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
