package com.djd.indiancricketers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnPlayersProfile,btnPhotoGalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    public void initViews(){
        btnPlayersProfile = findViewById(R.id.profile_button);
        btnPhotoGalary = findViewById(R.id.photo_galary_button);
        btnPlayersProfile.setTransformationMethod(null);
        btnPhotoGalary.setTransformationMethod(null);

        btnPlayersProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PlayersProfileActivity.class);
                startActivity(intent);
            }
        });

        btnPhotoGalary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PhotoGalaryActivity.class);
                startActivity(intent);
            }
        });
    }
}
