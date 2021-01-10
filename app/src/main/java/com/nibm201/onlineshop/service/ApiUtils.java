package com.nibm201.onlineshop.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtils {
    private ApiUtils() {
    }

    public static final String API_URL= "http://192.168.8.100:8083/api/user/";

    public static userAccountService getUserAccountService(){
        return RetrofitClient.getClient(API_URL).create(userAccountService.class);
//         Retrofit retrofit= new Retrofit.Builder()
//                .baseUrl(API_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
    }

}
