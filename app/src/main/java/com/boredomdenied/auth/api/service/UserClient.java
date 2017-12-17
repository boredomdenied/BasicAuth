package com.boredomdenied.auth.api.service;

import com.boredomdenied.auth.api.model.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by boredomdenied on 12/16/17.
 */

public interface UserClient {

    @GET("basic")
    Call<User> getUser(@Header("Authorization") String authHeader);
}
