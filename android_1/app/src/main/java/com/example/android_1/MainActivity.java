package com.example.android_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button switch_text = (Button)findViewById(R.id.button);
        switch_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch_text.setText("登出");
            }
        });
    }
}