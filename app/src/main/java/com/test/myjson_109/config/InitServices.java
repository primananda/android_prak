package com.test.myjson_109.config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class InitServices {
    private static String URL = "http://192.168.100.64/film/functions/get.php";

    public static Retrofit setInit(){
        return new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public static ApiFilm getInstance(){
        return setInit().create(ApiFilm.class);
    }

    public static String getUrl(){
        return URL;
    }
}
