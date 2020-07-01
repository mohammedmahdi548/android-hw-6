package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movie m1 = new movie("monsterinc","sulley",100,6,"family");
        movie m2 = new movie("JohnnyEnglish","Rowan Atkinson",7,13,"comedy");
        
    }
}