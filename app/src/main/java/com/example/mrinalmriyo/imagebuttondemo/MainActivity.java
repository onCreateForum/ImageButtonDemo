package com.example.mrinalmriyo.imagebuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib=(ImageButton)findViewById(R.id.imageButton);

    }

    public void imageListener(View view){

        Toast.makeText(this, "Hello Pug", Toast.LENGTH_LONG).show();

    }

}
