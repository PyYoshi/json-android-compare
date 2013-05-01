package com.martinadamek.jsonandroid.twitter;

import org.codehaus.jackson.annotate.JsonProperty;

public class User {
    public User() {

    }

    @JsonProperty("profile_sidebar_fill_color")
    String profileSidebarFillColor;

    @JsonProperty
    String url;

    @JsonProperty("profile_background_tile")
    boolean profileBackgroundTile;

    @JsonProperty("time_zone")
    String timeZone;

    @JsonProperty
    String description;

    @JsonProperty("listed_count")
    int listedCount;

    @JsonProperty
    boolean following;

    @JsonProperty
    boolean verified;

    @JsonProperty("friends_count")
    int friendsCount;

    @JsonProperty("followers_count")
    int followersCount;

    @JsonProperty
    String location;

    @JsonProperty("profile_link_color")
    String profileLinkColor;

    @JsonProperty("id_str")
    String idStr;

    @JsonProperty("is_translator")
    boolean isTranslator;

    @JsonProperty("contributors_enabled")
    boolean contributorsEnabled;

    @JsonProperty("profile_use_background_image")
    boolean profileUseBackgroundImage;

    @JsonProperty
    boolean notifications;

    @JsonProperty("profile_background_color")
    String profileBackgroundColor;

    @JsonProperty("protected")
    boolean protected_;

    @JsonProperty("show_all_inline_media")
    boolean showAllInlineMedia;

    @JsonProperty("geo_enabled")
    boolean geoEnabled;

    @JsonProperty("profile_background_image_url")
    String profileBackgroundImageUrl;

    @JsonProperty
    String name;

    @JsonProperty("follow_request_sent")
    boolean followRequestSent;

    @JsonProperty("statuses_count")
    int statusesCount;

    @JsonProperty
    int id;

    @JsonProperty
    String lang;

    @JsonProperty("utc_offset")
    int utcOffset;

    @JsonProperty("created_at")
    String createdAt;

    @JsonProperty("profile_text_color")
    String profileTextColor;

    @JsonProperty("default_profile")
    boolean defaultProfile;

    @JsonProperty("default_profile_image")
    boolean defaultProfileImage;

    @JsonProperty("favourites_count")
    int favouritesCount;

    @JsonProperty("profile_image_url")
    String profileImageUrl;

    @JsonProperty("profile_sidebar_border_color")
    String profileSidebarBorderColor;

    @JsonProperty("screen_name")
    String screenName;

    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    public void setProfileBackgroundTile(boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getListedCount() {
        return listedCount;
    }

    public void setListedCount(int listedCount) {
        this.listedCount = listedCount;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public int getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(int friendsCount) {
        this.friendsCount = friendsCount;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public boolean isTranslator() {
        return isTranslator;
    }

    public void setTranslator(boolean translator) {
        isTranslator = translator;
    }

    public boolean isContributorsEnabled() {
        return contributorsEnabled;
    }

    public void setContributorsEnabled(boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    public boolean isProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    public boolean isNotifications() {
        return notifications;
    }

    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }

    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    public boolean isProtected_() {
        return protected_;
    }

    public void setProtected_(boolean protected_) {
        this.protected_ = protected_;
    }

    public boolean isShowAllInlineMedia() {
        return showAllInlineMedia;
    }

    public void setShowAllInlineMedia(boolean showAllInlineMedia) {
        this.showAllInlineMedia = showAllInlineMedia;
    }

    public boolean isGeoEnabled() {
        return geoEnabled;
    }

    public void setGeoEnabled(boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFollowRequestSent() {
        return followRequestSent;
    }

    public void setFollowRequestSent(boolean followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    public int getStatusesCount() {
        return statusesCount;
    }

    public void setStatusesCount(int statusesCount) {
        this.statusesCount = statusesCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getProfileTextColor() {
        return profileTextColor;
    }

    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    public boolean isDefaultProfile() {
        return defaultProfile;
    }

    public void setDefaultProfile(boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    public boolean isDefaultProfileImage() {
        return defaultProfileImage;
    }

    public void setDefaultProfileImage(boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    public int getFavouritesCount() {
        return favouritesCount;
    }

    public void setFavouritesCount(int favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
}
