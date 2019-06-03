package com.example.yandexapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class BrowserLoginActivity3 extends Activity {

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        Log.e("YandexApp", "BrowserLoginActivity3 onCreate");
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://yandex.ru"));
            startActivity(intent);
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Log.e("YandexApp", "BrowserLoginActivity3 onNewIntent");
        super.onNewIntent(intent);
        finish();
    }

    @Override
    protected void onStart() {
        Log.e("YandexApp", "BrowserLoginActivity3 onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("YandexApp", "BrowserLoginActivity3 onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e("YandexApp", "BrowserLoginActivity3 onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("YandexApp", "BrowserLoginActivity3 onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("YandexApp", "BrowserLoginActivity3 onDestroy");
        super.onDestroy();
    }

}
