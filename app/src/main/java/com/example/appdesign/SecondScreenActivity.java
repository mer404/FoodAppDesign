package com.example.appdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class SecondScreenActivity extends AppCompatActivity {
    CircleImageView plusbtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        plusbtn1 = findViewById(R.id.plusbtn1);

        plusbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondScreenActivity.this, WebOpenActivity.class);
                startActivity(intent);

            }
        });
    }
}