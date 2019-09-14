package com.example.sept7_4ita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.net.Uri;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void ustWebsite(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ust.edu.ph"));
        //intent.setData(Uri.parse("http://www.ust.edu.ph"));
        startActivity(intent);
    }
    public void blackBoard(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ust.blackboard.com"));
        //intent.setData(Uri.parse("http://www.ust.blackboard.com"));
        startActivity(intent);
    }
    public void myUste(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.myuste.ust.edu.ph"));
        //intent.setData(Uri.parse("http://www.myuste.ust.edu.ph"));
        startActivity(intent);
    }
}
