package com.example.suas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Upload extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upload);

    }
    public void ToControl (View v){
        Intent TC = new Intent(this, Control.class);
        startActivity (TC);
    }
    public void ToConnect (View v){
        Intent TConn = new Intent(this, Connect.class);
        startActivity (TConn);
    }
}

