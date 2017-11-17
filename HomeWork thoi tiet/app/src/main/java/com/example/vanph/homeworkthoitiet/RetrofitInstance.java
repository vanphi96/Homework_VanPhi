package com.example.vanph.homeworkthoitiet;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by vanph on 17/11/2017.
 */

public class RetrofitInstance {
    public static Retrofit retrofit;
    public static  Retrofit getInstace()
    {
        if(retrofit==null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://api.openweathermap.org/data/2.5/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
