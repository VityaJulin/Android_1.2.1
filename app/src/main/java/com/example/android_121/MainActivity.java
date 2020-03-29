package com.example.android_121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText userName;
    private EditText userEmail;
    private Button okBtn;
    private Button eraseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = userName.getText().toString();
                String email = userEmail.getText().toString();
                Toast.makeText(MainActivity.this, getResources().getString(R.string.toast_output_name)
                        + " " + name + " " + getResources().getString(R.string.toast_output_email) + " " + email, Toast.LENGTH_LONG).show();
            }
        });

        eraseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName.getText().clear();
                userEmail.getText().clear();
            }
        });
    }

    public void init() {
        userName = findViewById(R.id.enter_name);
        userEmail = findViewById(R.id.enter_email);
        okBtn = findViewById(R.id.ok);
        eraseBtn = findViewById(R.id.erase);
    }
}
