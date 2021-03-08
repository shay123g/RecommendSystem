package client;

import pojos.LocationObj;
import pojos.SuspectObj;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.List;

public interface IOmnixApi {
    @POST("/retrieveSuspects")
    Call <List<SuspectObj>> suspects(@Body LocationObj location);
}
