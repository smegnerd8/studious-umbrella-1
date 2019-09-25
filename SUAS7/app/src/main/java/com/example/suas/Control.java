package com.example.suas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Control extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control);
    }
    public void BackToUpload (View v){
        Intent BTU = new Intent(this, Upload.class);
        startActivity (BTU);
    }
}
