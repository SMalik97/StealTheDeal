package com.goldenfuturecommunication.stealthedeal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView containerWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        containerWebview=(WebView)findViewById(R.id.containerWebview);
        String url="http://vp254.co.ke/shopping/shop/shopping/index.php";
        containerWebview.setWebViewClient(new WebViewClient());
        containerWebview.getSettings().setJavaScriptEnabled(true);
        containerWebview.getSettings().setDisplayZoomControls(true);
        containerWebview.getSettings().setSupportZoom(true);
        containerWebview.getSettings().setBuiltInZoomControls(true);
        containerWebview.getSettings().setLoadWithOverviewMode(true);
        containerWebview.getSettings().setUseWideViewPort(true);
        containerWebview.loadUrl(url);
        getSupportActionBar().hide();
    }
    @Override
    public void onBackPressed(){
        if(containerWebview.canGoBack()){
            containerWebview.goBack();

        }else
        {
            finish();
        }
    }
}
