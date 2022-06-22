package com.example.appdesign;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdScreenUiActivity extends AppCompatActivity {
    TextView txtBack, txtCheckout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen_ui);
        txtBack = findViewById(R.id.txtBack);
        txtCheckout = findViewById(R.id.txtCheckout);

        txtCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdScreenUiActivity.this, SecondScreenActivity.class);
                startActivity(intent);

            }
        });

        txtBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdScreenUiActivity.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}