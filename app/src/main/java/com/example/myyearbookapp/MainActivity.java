package com.example.myyearbookapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private WebView webview;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //ImageView iv = (ImageView)findViewById(R.id.imageView5);
        //iv.setOnClickListener(new View.OnClickListener() {


//        }

    }

    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, webview.class);
        startActivity(intent);
    }
}