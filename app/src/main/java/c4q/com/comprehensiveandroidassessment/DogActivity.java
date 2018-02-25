package c4q.com.comprehensiveandroidassessment;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import c4q.com.comprehensiveandroidassessment.puppy_models.Dogs;
import c4q.com.comprehensiveandroidassessment.puppy_models.Dogs2;
import c4q.com.comprehensiveandroidassessment.recyclerview.DogArray;
import c4q.com.comprehensiveandroidassessment.recyclerview.RvAdapter;
import c4q.com.comprehensiveandroidassessment.services.DogService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DogActivity extends AppCompatActivity {

    public static final String TAG = "DOGS";

    DogService dogService;
    RecyclerView recyclerView;
    Configuration configuration;
    List<DogArray> dogArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);
        configuration = getResources().getConfiguration();

        onConfigurationChanged(configuration);
        recyclerView.setAdapter(new RvAdapter());

        Retrofit retrofit = new Retrofit.Builder() //This Starts the builder process.
                .baseUrl("https://dog.ceo")//this is our base url, or gateway to JSON. Our Full End point.
                .addConverterFactory(GsonConverterFactory.create())//does JSON Serialization/Deserialization.
                .build();//ends transaction and returns us to full retrofit instance.

        dogService = retrofit.create(DogService.class);

        Call<Dogs2> dogArrayCall = dogService.getDog();
        dogArrayCall.enqueue(new Callback<Dogs2>() {
            @Override
            public void onResponse(Call<Dogs2> call, Response<Dogs2> response) {

                Log.d(TAG,"OnResponse" + response.body().getDogBreed());
                dogArrayList = (List<DogArray>) response.body();




            }

            @Override
            public void onFailure(Call<Dogs2> call, Throwable t) {
                Log.d(TAG, "On Response" + t.toString());
            }
        });


    }

    @Override
  public void onConfigurationChanged(Configuration newConfig){
              super.onConfigurationChanged(newConfig);
              // Orientation of screen, changes gridlayout according to phone orientation
                        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
                        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));
                    } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
                      recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
                  }
            }

}

