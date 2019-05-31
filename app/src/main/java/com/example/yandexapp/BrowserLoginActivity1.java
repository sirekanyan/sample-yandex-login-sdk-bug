package com.example.yandexapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class BrowserLoginActivity1 extends Activity {

    private final Handler handler = new Handler();
    private final Runnable finishRunnable = new Runnable() {
        @Override
        public void run() {
            finish();
        }
    };

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        Log.e("YandexApp", "BrowserLoginActivity1 onCreate");
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://yandex.ru"));
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        Log.e("YandexApp", "BrowserLoginActivity1 onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("YandexApp", "BrowserLoginActivity1 onResume");
        super.onResume();
        handler.post(finishRunnable);
    }

    @Override
    protected void onPause() {
        Log.e("YandexApp", "BrowserLoginActivity1 onPause");
        handler.removeCallbacks(finishRunnable);
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("YandexApp", "BrowserLoginActivity1 onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("YandexApp", "BrowserLoginActivity1 onDestroy");
        super.onDestroy();
    }

}
