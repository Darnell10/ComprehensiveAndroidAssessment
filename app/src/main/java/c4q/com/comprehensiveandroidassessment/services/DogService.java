package c4q.com.comprehensiveandroidassessment.services;

import c4q.com.comprehensiveandroidassessment.puppy_models.Dogs;
import c4q.com.comprehensiveandroidassessment.puppy_models.Dogs2;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by D on 2/25/18.
 */

public interface DogService {

    //https://dog.ceo/api/breed/terrier/images/random

    //@GET("api/breed/breeds/images/random")
    @GET("api/breed/{breed-name}/images/random")
    Call<Dogs2> getDog();




}
