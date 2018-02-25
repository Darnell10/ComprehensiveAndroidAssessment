package c4q.com.comprehensiveandroidassessment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private static final String SHARED_PREFS_KEY = "sharedkey";
    private TextView signin;
    private EditText user;
    private EditText userPassword;
    private CheckBox checkBox;
    private Button submitButton;
    private SharedPreferences login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signin = findViewById(R.id.signin);
        user = findViewById(R.id.user_name_edit);
        userPassword = findViewById(R.id.password_edit);
        submitButton = findViewById(R.id.submit_button);

        login = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY,MODE_PRIVATE);



        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = login.edit();
                if (checkBox.isChecked()) {
                    editor.putString("username", user.getText().toString());
                    editor.putString("password", userPassword.getText().toString());
                    editor.putBoolean("isChecked", checkBox.isChecked());
                    editor.commit();
                } else {
                    editor.putBoolean("isChecked", checkBox.isChecked());
                    editor.commit();
                }

                if (user == null){
                    Toast.makeText(LoginActivity.this, "Please Enter Username", Toast.LENGTH_SHORT).show();
                }
                if (userPassword == null){
                    Toast.makeText(LoginActivity.this, "please Enter password", Toast.LENGTH_SHORT).show();
                }

                String checkUser = "charlie" + user.getText().toString();
                String checkPassword = "abc123" + user.getText().toString();

                if (user.getText().toString().equalsIgnoreCase(login.getString(checkUser, null))
                        && userPassword.getText().toString().equals(login.getString(checkPassword, null))) {

                    Intent intent = new Intent(LoginActivity.this, BreedsActivity.class);
                    intent.putExtra("currentUser", user.getText().toString());
                    startActivity(intent);

//                    Intent intent1 = new Intent(LoginActivity.this, BreedsActivity.class);
//                    intent.putExtra("Key", SHARED_PREFS_KEY);
//                    startActivity(intent1);
                }

            }
        });


    }
}
