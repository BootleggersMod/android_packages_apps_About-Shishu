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

import android.os.Bundle;

import org.eldainosor.about.helpers.Downloader;
import org.eldainosor.about.helpers.Util;

import java.util.List;

import retrofit2.Call;

public class Developers extends org.eldainosor.about.abstracts.Developers {

    @Override
    public Call<List<Util>> getDevsCall() {
        return Downloader.getDevsApi().getDevs();
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
    }
}