package com.example.myyearbookapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
    }

    public void loadUrl (String url)
    {
        webview myWebView = (webview) findViewById(R.id.webview);
        myWebView.loadUrl("http://www.google.com");

    }



}
