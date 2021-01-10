package com.nibm201.onlineshop.service;

import com.nibm201.onlineshop.model.userAccount;
import com.nibm201.onlineshop.model.userAccountDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface userAccountService {

    //get all users
    @GET("users/")
     Call<List<userAccountDetails>> getAllUsers();

    //set Account details
    @POST("addAccDetails/")
    Call<userAccountDetails> setAccountDetails();

    //set account username and pass
    @POST("addAcc/")
    Call<userAccount> setAccount();

    //forget pass
    @PUT("updatePass/{username}")
    Call<userAccount> updateUserPass(@Path("username") String username, @Body userAccount account);
}
