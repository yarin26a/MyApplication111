package com.example.myapplication11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclicklogin(View view) {
        Intent i=new Intent(this,MainActivity1.class);
        i.putExtra("email","yarin_asulin");
        startActivity(i);
    }

    public void onclickregister(View view) {
        Intent i=new Intent(this,MainActivity1.class);
        i.putExtra("email","yarin_asulin");
        startActivity(i);
    }
}