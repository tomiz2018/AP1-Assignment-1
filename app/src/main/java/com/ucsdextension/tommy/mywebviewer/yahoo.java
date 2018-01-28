package com.ucsdextension.tommy.mywebviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class yahoo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yahoo);

        WebView yahooWeb =(WebView) findViewById(R.id.webViewYahoo);
        yahooWeb.setWebViewClient(new WebViewClient());
        yahooWeb.loadUrl("http://www.yahoo.com");
    }
}
