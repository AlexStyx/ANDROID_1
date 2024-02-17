package com.example.android_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MY_APP_LOG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        Log.w(TAG, "onCreate");
        Log.i(TAG, "onCreate");
        Log.e(TAG, "onCreate");
        Log.v(TAG, "onCreate");

        showToast("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        Log.w(TAG, "onStart");
        Log.i(TAG, "onStart");
        Log.e(TAG, "onStart");
        Log.v(TAG, "onStart");

        showToast("onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Log.w(TAG, "onStop");
        Log.i(TAG, "onStop");
        Log.e(TAG, "onStop");
        Log.v(TAG, "onStop");
        showToast("onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Log.w(TAG, "onDestroy");
        Log.i(TAG, "onDestroy");
        Log.e(TAG, "onDestroy");
        Log.v(TAG, "onDestroy");
        showToast("onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Log.w(TAG, "onPause");
        Log.i(TAG, "onPause");
        Log.e(TAG, "onPause");
        Log.v(TAG, "onPause");
        showToast("onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        Log.w(TAG, "onResume");
        Log.i(TAG, "onResume");
        Log.e(TAG, "onResume");
        Log.v(TAG, "onResume");
        showToast("onResume");
    }

    private void showToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

}