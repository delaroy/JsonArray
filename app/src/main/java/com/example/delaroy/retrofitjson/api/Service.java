package com.example.delaroy.retrofitjson.api;

import com.google.gson.JsonArray;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by delaroy on 7/3/17.
 */

public interface Service {

    @GET("/teams/teams.json")
    Call<JsonArray> readTeamArray();

}
