package com.example.sofra.data.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "https://ipda3-tech.com/sofra-v2/api/v2/";
    public static Retrofit retrofit = null;

    public static ApiServices getApiClient(){

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiServices.class);
    }
}
