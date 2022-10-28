package com.example.lavajavaapp.SendNotification;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=BP-hVKylbRFlm7ynUKmjKT0NnZo-Mz-TpdPv5FItuwViMNc4PjBUilVXNWlno1lshJtUnv9z_jKYHdk6qrfxhTY "
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
