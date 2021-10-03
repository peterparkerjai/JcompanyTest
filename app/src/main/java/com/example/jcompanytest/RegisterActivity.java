package com.example.jcompanytest;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import  androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jcompanytest.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysignup);

        Bundle b = this.getIntent().getExtras();
        Log.e("filter ", "" + b);
        if (b != null) {

            String email = b.get("email").toString();
            String pass = b.get("password").toString();
            Log.e("email ", "" + email);
            Log.e("password ", "" + pass);
            Toast.makeText(RegisterActivity.this, "email= " + email, Toast.LENGTH_SHORT).show();
            Toast.makeText(RegisterActivity.this, "password= " + pass, Toast.LENGTH_SHORT).show();

        }
    }
}

