package c4q.com.comprehensiveandroidassessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BreedsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breeds);

        TextView textView = findViewById(R.id.user_greeeting);
        Intent intent = getIntent();
        String user = intent.getStringExtra("currentUser");
        textView.setText("What kind of Dog would you like to see,  " + user);


    }
}
