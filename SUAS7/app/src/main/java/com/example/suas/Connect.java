package com.example.suas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Connect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connect);


    }
    public void ToUpload (View v){
        Intent TU = new Intent(this, Upload.class);
        startActivity (TU);
    }
}

