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

package org.eldainosor.about.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import org.eldainosor.about.R;
import org.eldainosor.about.helpers.Util;

public class SocialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.social_layout);

        Util social = (Util) getIntent().getSerializableExtra("social");
        final org.eldainosor.about.helpers.Util uri = social.getUri();

        ImageView googleplus = (ImageView) findViewById(R.id.google_plus);
        ImageView twitter = (ImageView) findViewById(R.id.twitter);
        ImageView github = (ImageView) findViewById(R.id.github);
        ImageView headl = (ImageView) findViewById(R.id.headl);
        ImageView song = (ImageView) findViewById(R.id.song);
        ImageView spotify = (ImageView) findViewById(R.id.spotify);
        ImageView telegram = (ImageView) findViewById(R.id.telegram);
        ImageView youtube = (ImageView) findViewById(R.id.youtube);
        ImageView wallpapers = (ImageView) findViewById(R.id.wallpapers);

        googleplus.setVisibility(uri.getGooglePlus().equals("") ? View.GONE : View.VISIBLE);
        github.setVisibility(uri.getGithub().equals("") ? View.GONE : View.VISIBLE);
        twitter.setVisibility(uri.getTwitter().equals("") ? View.GONE : View.VISIBLE);
        headl.setVisibility(uri.getHeaDL().equals("") ? View.GONE : View.VISIBLE);
        song.setVisibility(uri.getSong().equals("") ? View.GONE : View.VISIBLE);
        spotify.setVisibility(uri.getSpotify().equals("") ? View.GONE : View.VISIBLE);
        telegram.setVisibility(uri.getTelegram().equals("") ? View.GONE : View.VISIBLE);
        youtube.setVisibility(uri.getYoutube().equals("") ? View.GONE : View.VISIBLE);
        wallpapers.setVisibility(uri.getWallpapers().equals("") ? View.GONE : View.VISIBLE);

        if (uri.getGooglePlus().equals("") && uri.getTwitter().equals("") && uri.getGithub().equals("")) {
            setContentView(R.layout.no_contact);
        }

        googleplus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent googleplusIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri.getGooglePlus()));
                startActivity(googleplusIntent);
            }
        });

        github.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent githubIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri.getGithub()));
                startActivity(githubIntent);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent twitterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri.getTwitter()));
                startActivity(twitterIntent);
            }
        });
        headl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent headlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri.getHeaDL()));
                startActivity(headlIntent);
            }
        });
        song.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent songIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri.getSong()));
                startActivity(songIntent);
            }
        });
        spotify.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent spotifyIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri.getSpotify()));
                startActivity(spotifyIntent);
            }
        });
        telegram.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent telegramIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri.getTelegram()));
                startActivity(telegramIntent);
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent youtubeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri.getYoutube()));
                startActivity(youtubeIntent);
            }
        });
        wallpapers.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent wallpapersIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri.getWallpapers()));
                startActivity(wallpapersIntent);
            }
        });

    }
}