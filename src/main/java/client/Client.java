package client;

import retrofit2.Retrofit;
import retrofit2.Retrofit;

public class Client {
         Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.omnixServer.com/")
                .build();

         IOmnixApi client = retrofit.create(IOmnixApi.class);
}

