package com.example.yandexapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class BrowserLoginActivity2 extends Activity {

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        Log.e("YandexApp", "BrowserLoginActivity2 onCreate");
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://yandex.ru"));
        startActivity(intent);
        finish();
    }

    @Override
    protected void onStart() {
        Log.e("YandexApp", "BrowserLoginActivity2 onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("YandexApp", "BrowserLoginActivity2 onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e("YandexApp", "BrowserLoginActivity2 onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("YandexApp", "BrowserLoginActivity2 onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("YandexApp", "BrowserLoginActivity2 onDestroy");
        super.onDestroy();
    }

}
