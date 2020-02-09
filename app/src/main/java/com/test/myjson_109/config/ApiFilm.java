package com.test.myjson_109.config;

import com.test.myjson_109.model.GetFilm;
import com.test.myjson_109.model.PostPutDeleteFilm;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiFilm {
    @GET("functions/get.php")
    Call<GetFilm> getFilm();

    @FormUrlEncoded
    @POST("functions/insert.php")
    Call<PostPutDeleteFilm> postFilm( @Field("judul") String judul,
                                      @Field("genre") String genre,
                                      @Field("tahun") String tahun,
                                      @Field("durasi") int durasi,
                                      @Field("images") String images);

    @FormUrlEncoded
    @POST("functions/update.php")
    Call<PostPutDeleteFilm> putFilm(@Field("id") int id,
                                 @Field("judul") String judul,
                                 @Field("genre") String genre,
                                 @Field("tahun") String tahun,
                                 @Field("durasi") int durasi);

    @FormUrlEncoded
    @POST("functions/delete.php")
    Call<PostPutDeleteFilm> delFilm(@Field("id") int id);
}
