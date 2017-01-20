package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import android.view.Window;

public class SatuHalaman extends Activity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.halaman_satu);

        mWebView = (WebView) findViewById(R.id.activity_main_webview);

        // Force links and redirects to open in the WebView instead of in a browser
//        mWebView.setWebViewClient(new WebViewClient());

        // Enable Javascript
//        WebSettings webSettings = mWebView.getSettings();
//        webSettings.setJavaScriptEnabled(true);

        // Use remote resource
       //  mWebView.loadUrl("http://mock.robotemplates.com/webviewapp/home.html");


        mWebView.loadUrl((getResources().getString(R.string.url_halamansatu)));


//         Stop local links and redirects from opening in browser instead of WebView
//         mWebView.setWebViewClient(new MyAppWebViewClient());

//         Use local resource
//         mWebView.loadUrl("file:///android_asset/www/index.html");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //tombol kembali ke home
        Button go = (Button)findViewById(R.id.btnhome);
        go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
            }
        });


    }





}
