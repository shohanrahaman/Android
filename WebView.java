//activity_main.xml
--------------------

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.sazal.shohan.mywebview.MainActivity">

    <WebView
        android:id="@+id/webV"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
    </WebView>

</LinearLayout>


==============================================================================


//ManiActivity.java
--------------------

package com.sazal.shohan.mywebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView)findViewById(R.id.webV);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("http://www.youthfireit.com/");
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.canGoBack();
        }else{
            super.onBackPressed();
        }
    }
}











