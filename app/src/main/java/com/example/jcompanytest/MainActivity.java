package com.example.jcompanytest;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    Button buttonLogin,signup;
    EditText email,password;
    TextView doYou;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start();

    }

    public void start(){
        buttonLogin = findViewById(R.id.loginBtn);
        signup = findViewById(R.id.registerBtn);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        doYou = findViewById(R.id.doYou);

        buttonLogin.setOnClickListener(
                v -> {
                    String emailId = email.getText().toString();
                    String pass = password.getText().toString();
                    boolean access = false;
                    //Check pass email logic
                        if(!emailId.isEmpty() && !pass.isEmpty())   access=true;
                    //
                    if(access){
                        List<String> list = new ArrayList<>();

                        list.add("a");
                        list.add("b");
                        list.add("c");
                        list.add("a1");
                        list.add("b1");
                        list.add("c1");

                        MyAdapter adapter = new MyAdapter(list);

                        Intent intent = new Intent(MainActivity.this,recycler.class);
                        intent.putExtra("list", String.valueOf(list));
                        this.startActivity(intent);
                    }else{
                        Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_LONG).show();
                    }
                }
        );

        signup.setOnClickListener(
                v -> {
                    Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
                    MainActivity.this.startActivity(intent);
                }
        );

        doYou.setOnClickListener(
                v -> {

                }
        );
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
