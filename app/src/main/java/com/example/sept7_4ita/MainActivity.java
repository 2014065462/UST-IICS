package com.example.sept7_4ita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("sept7-4ita", "onCreate() has executed..");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("sept7-4ita", "onStart() has executed..");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("sept7-4ita", "onResume() has executed..");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("sept7-4ita", "onPause() has executed..");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("sept7-4ita", "onStop() has executed..");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("sept7-4ita", "onDestroy() has executed..");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("sept7-4ita", "onRestart() has executed..");
    }
    public void switchActivity(View v) {
        startActivity(new Intent(this, Main2Activity.class));
    }
    public void viewLog(View v) {
        for(int i = 0; i < 10; i++){
            Log.d("hello-tag",  (i+1) + " Greetings!" );
        }
    }
}