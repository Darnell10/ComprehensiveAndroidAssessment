package c4q.com.comprehensiveandroidassessment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;

public class BreedsActivity extends AppCompatActivity {

    private SharedPreferences previousPref;
    TextView greetingText;
    ImageView imageView;
    TextView terry;
    TextView span;
    TextView retr;
    TextView poodle;
    String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breeds);

        Intent intent = getIntent();
        String user = intent.getStringExtra("currentUser");
        greetingText.setText("What kind of Dog would you like to see,  " + user);
        previousPref = getApplicationContext().getSharedPreferences(intent.getStringExtra("testKey"), MODE_PRIVATE);
        greetingText = findViewById(R.id.user_greeting);
        terry = findViewById(R.id.terrier_text);
        span = findViewById(R.id.spaniel_text);
        retr = findViewById(R.id.retriever_text);
        poodle = findViewById(R.id.poodle_text);
        Intent dogIntent = getIntent();
        url = dogIntent.getStringExtra("picture");


        Intent intent1 = new Intent(BreedsActivity.this, DogActivity.class);
        startActivity(intent1);



    }
}