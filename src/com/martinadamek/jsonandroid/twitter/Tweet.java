package com.martinadamek.jsonandroid.twitter;

import org.codehaus.jackson.annotate.JsonProperty;

public class Tweet{
    public Tweet() {

    }

    @JsonProperty
    String text;

    @JsonProperty("in_reply_to_screen_name")
    String inReplyToScreenName;

    @JsonProperty("in_reply_to_status_id")
    int inReplyToStatusId;

    @JsonProperty
    Place place;

    @JsonProperty("in_reply_to_user_id")
    int inReplyToUserId;

    @JsonProperty
    boolean retweeted;

    @JsonProperty
    String source;

    @JsonProperty("id_str")
    String idStr;

    @JsonProperty("in_reply_to_status_id_str")
    String inReplyToStatusIdStr;

    @JsonProperty
    Object geo;

    @JsonProperty
    Object contributors;

    @JsonProperty
    String inReplyToUserIdStr;

    @JsonProperty("retweet_count")
    int retweetCount;

    @JsonProperty
    boolean truncated;

    @JsonProperty
    Object coordinates;

    @JsonProperty
    int id;

    @JsonProperty
    boolean favorited;

    @JsonProperty("created_at")
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

    public Object getGeo() {
        return geo;
    }

    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public Object getContributors() {
        return contributors;
    }

    public void setContributors(Object contributors) {
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

    public Object getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Object coordinates) {
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
