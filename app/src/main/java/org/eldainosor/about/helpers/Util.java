/*
 * Copyright (C) 2017 The Dirty Unicorns Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eldainosor.about.helpers;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Util implements Serializable {

    @SerializedName("dev_name")
    private String devName;
    @SerializedName("dev_title")
    private String devTitle;
    @SerializedName("dev_devices")
    private String devDevices;
    @SerializedName("card_background")
    private String cardBackground = null;
    @SerializedName("card_avatar")
    private String cardAvatar = null;

    @SerializedName("google_plus")
    private String googlePlus = null;
    @SerializedName("twitter")
    private String twitter = null;
    @SerializedName("github")
    private String github = null;
    @SerializedName("headl")
    private String headl = null;
    @SerializedName("song")
    private String song = null;
    @SerializedName("spotify")
    private String spotify = null;
    @SerializedName("telegram")
    private String telegram = null;
    @SerializedName("youtube")
    private String youtube = null;
    @SerializedName("wallpapers")
    private String wallpapers = null;

    private Util uri;


    public String getDevName() {
        return devName;
    }
    public String getDevTitle() {
        return devTitle;
    }
    public String getDevDevices() {
        return devDevices;
    }
    public String getCardBackground() {
        return cardBackground;
    }
    public String getCardAvatar() {
        return cardAvatar;
    }

    public String getGooglePlus() {
        return googlePlus;
    }
    public String getTwitter() {
        return twitter;
    }
    public String getGithub() {
        return github;
    }
    public String getHeaDL() {
        return headl;
    }
    public String getSong() {
        return song;
    }
    public String getSpotify() {
        return spotify;
    }
    public String getTelegram() {
        return telegram;
    }
    public String getYoutube() {
        return youtube;
    }
    public String getWallpapers() {
        return wallpapers;
    }

    public Util(Util uri) {
        this.uri = uri;
    }
    public Util getUri() {
        return uri;
    }
    public Util getAvatar() {
        return uri;
    }
}
