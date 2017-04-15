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

package org.eldainosor.about.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import org.eldainosor.about.R;

public class GeneralInfo extends PreferenceFragmentCompat {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ImageView googleplus = (ImageView) rootView.findViewById(R.id.google_plus);
        googleplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent googleplus = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.google_plus_link)));
                startActivity(googleplus);
            }
        });
        ImageView github = (ImageView) rootView.findViewById(R.id.github);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent github = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.github_link)));
                startActivity(github);
            }
        });
        ImageView twitter = (ImageView) rootView.findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twitter = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.twitter_link)));
                startActivity(twitter);
            }
        });
        ImageView headl = (ImageView) rootView.findViewById(R.id.headl);
        headl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent headl = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.headl_link)));
                startActivity(headl);
            }
        });
        ImageView song = (ImageView) rootView.findViewById(R.id.song);
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent song = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.song_link)));
                startActivity(song);
            }
        });
        ImageView spotify = (ImageView) rootView.findViewById(R.id.spotify);
        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spotify = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.spotify_link)));
                startActivity(spotify);
            }
        });
        ImageView telegram = (ImageView) rootView.findViewById(R.id.telegram);
        telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telegram = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.telegram_link)));
                startActivity(telegram);
            }
        });
        ImageView youtube = (ImageView) rootView.findViewById(R.id.youtube);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent youtube = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.youtube_link)));
                startActivity(youtube);
            }
        });
        ImageView wallpapers = (ImageView) rootView.findViewById(R.id.wallpapers);
        wallpapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wallpapers = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.wallpapers_link)));
                startActivity(wallpapers);
            }
        });


        return rootView;
    }
}
