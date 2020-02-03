package edu.com.deepdive.nasaapod.service;

import edu.com.deepdive.nasaapod.model.entity.Apod;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApodService {

  @GET("planetary/apod")
  Call<Apod> get(@Query("api_key") String apiKey, @Query("date") String date);

}
