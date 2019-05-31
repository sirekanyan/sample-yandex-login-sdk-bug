package com.example.yandexapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class TranslucentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translucent_activity);
    }

    public void asdf(View view) {
        Toast.makeText(this, "Translucent activity clicked!\nPress BACK button!", Toast.LENGTH_SHORT).show();
    }

}
