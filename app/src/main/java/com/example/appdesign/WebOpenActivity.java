package com.example.appdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebOpenActivity extends AppCompatActivity {
    WebView webView;
    //https://pizzaonline.dominos.co.in/?autoLocate=true

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_open);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://pizzaonline.dominos.co.in/?autoLocate=true");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
