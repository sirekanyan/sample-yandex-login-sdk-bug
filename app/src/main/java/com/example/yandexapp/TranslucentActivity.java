package com.example.yandexapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class TranslucentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e("YandexApp", "TranslucentActivity onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translucent_activity);
    }

    public void asdf(View view) {
        Toast.makeText(this, "Translucent activity clicked!\nPress BACK button!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        Log.e("YandexApp", "TranslucentActivity onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("YandexApp", "TranslucentActivity onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e("YandexApp", "TranslucentActivity onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("YandexApp", "TranslucentActivity onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("YandexApp", "TranslucentActivity onDestroy");
        super.onDestroy();
    }

}
