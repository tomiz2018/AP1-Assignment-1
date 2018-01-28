package com.ucsdextension.tommy.mywebviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class UCSD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucsd);

        WebView ucsdWeb =(WebView) findViewById(R.id.webViewUCSD);
        ucsdWeb.setWebViewClient(new WebViewClient());
        ucsdWeb.loadUrl("http://extension.ucsd.edu");

    }
}
