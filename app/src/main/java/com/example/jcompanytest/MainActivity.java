package com.example.jcompanytest;

import android.accounts.Account;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import  androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.jcompanytest.R;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycle;

    Button buttonLogin;
    EditText email,password;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        {
            recycle = (RecyclerView) findViewById(R.id.recycle);

            List<String> list = new ArrayList<>();
            list.add("a");
            list.add("b");
            list.add("c");
            list.add("a1");
            list.add("b1");
            list.add("c1");

            recycle.setLayoutManager(new LinearLayoutManager(this));

            recycle.setAdapter(new MyAdapter(list));

        }

    }

    public void myAlertDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Move to next page?").setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
             Log.e("alert dialog", "You clicked on Alert Dialog button");
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.e("alert dialog", "You clicked on Alert Dialog button");
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.setTitle("Hello");
        alertDialog.show();
    }
}
