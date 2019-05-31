package com.example.yandexapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;

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
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://yandex.ru"));
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        handler.post(finishRunnable);
    }

    @Override
    protected void onPause() {
        handler.removeCallbacks(finishRunnable);
        super.onPause();
    }

}
