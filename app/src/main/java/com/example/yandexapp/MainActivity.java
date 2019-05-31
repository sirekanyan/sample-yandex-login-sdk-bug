package com.example.yandexapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.internal.BrowserLoginActivity;
import com.yandex.authsdk.internal.Constants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    public void onBrowserClick(View view) {
        YandexAuthOptions options = new YandexAuthOptions(this, false);
        Intent intent = new Intent(this, BrowserLoginActivity.class);
        intent.putExtra(Constants.EXTRA_OPTIONS, options);
        startActivity(intent);
    }

    public void onBrowserClick1(View view) {
        Intent intent = new Intent(this, BrowserLoginActivity1.class);
        startActivity(intent);
    }

    public void onBrowserClick2(View view) {
        Intent intent = new Intent(this, BrowserLoginActivity2.class);
        startActivity(intent);
    }

    public void onTranslucentClick(View view) {
        startActivity(new Intent(this, TranslucentActivity.class));
    }

}
