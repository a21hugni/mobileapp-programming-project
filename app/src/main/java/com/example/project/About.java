package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class About extends AppCompatActivity {

    private WebView webview;


    //public void showInterWebPage() {
        //webview.loadUrl("file://android_assets/index.html");
    //}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

    }
}