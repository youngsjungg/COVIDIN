package com.example.covidin;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ApiService {

    static final String BASEURL = "http://openapi.data.go.kr/";
    static final String APPKEY= "INtNC54XZqdLzdO%2BaPP5sO9ZR3%2FgW1z7IbGhd6uPOuYaTmB5iYtZKJLRme9rlEEn23GBSkUNSIJUZYQ%2FygATHw%3D%3D";

    @GET("pageNo=1&numOfRows=10")
    Call<JSONObject> pageNo(@Header("pn")String pn , @Query("numOfRows")int numOfRows);
}
