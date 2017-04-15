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

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class Downloader {

    private static volatile DevsApi devsApi;

    public static DevsApi getDevsApi() {
        if (devsApi == null) {
            synchronized (Downloader.class) {
                if (devsApi == null) {
                    devsApi = new Retrofit.Builder()
                            .baseUrl("https://raw.githubusercontent.com/BootleggersMod/BootyJunk/master/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build()
                            .create(DevsApi.class);
                }
            }
        }
        return devsApi;
    }

    public interface DevsApi {
        @GET("developers.json")
        Call<List<Util>> getDevs();
    }

}
