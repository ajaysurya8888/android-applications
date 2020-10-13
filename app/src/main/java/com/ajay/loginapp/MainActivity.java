package com.ajay.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void WelcomeMessage(View view){
        EditText username = (EditText) findViewById(R.id.personText);
        EditText password = (EditText) findViewById(R.id.passwordText);
        Toast.makeText(this ,"hi "+username.getText().toString(),Toast.LENGTH_LONG).show();
    }
}