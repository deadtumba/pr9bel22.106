package com.example.pr9bel22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d = findViewById(R.id.imageView28);
        d.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        startActivity(new Intent(this, Steps.class));
    }
}