package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.formats.NativeAd;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.StartAppSDK;

import android.view.Window;


public class MainActivity extends Activity {

    //    private WebView mWebView;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

//        mWebView = (WebView) findViewById(R.id.activity_main_webview);

        // Force links and redirects to open in the WebView instead of in a browser
//        mWebView.setWebViewClient(new WebViewClient());

        // Enable Javascript
//        WebSettings webSettings = mWebView.getSettings();
//        webSettings.setJavaScriptEnabled(true);

        // Use remote resource
//         mWebView.loadUrl("http://mock.robotemplates.com/webviewapp/home.html");

//         Stop local links and redirects from opening in browser instead of WebView
//         mWebView.setWebViewClient(new MyAppWebViewClient());

//         Use local resource
//         mWebView.loadUrl("file:///android_asset/www/index.html");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        // tombol menuju artikel pertama halaman_satu
        final Button go = (Button) findViewById(R.id.btnartikel01);
        go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, SatuHalaman.class);
                startActivity(i);
            }
        });

//        NativeAd nativeAdview = (NativeAd)findViewById(R.id.nativeadView);
//        nativeAdview.loadAd(new AdRequest.Builder().build());
//


        //startups
//        StartAppSDK.init(this, "206836067", true);
        StartAppSDK.init(this, ".getString(R.string.startapp_id)", true);
        btn = ((Button) findViewById(R.id.btnartikel01));
//        Intent second;
        btn.setOnClickListener(new View.OnClickListener() {
                                   public void onClick(View v) {
                                       Intent second = new Intent(MainActivity.this, SatuHalaman.class);
                                       startActivity(second);
                                       StartAppAd.showAd(MainActivity.this);
                                   }}
                                   );


                               }

                // Prevent the back-button from closing the app
        @Override
        public void onBackPressed () {
//        if(mWebView.canGoBack()) {
//            mWebView.goBack();
//        } else {
//            super.onBackPressed();
//        }
        }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }


//        public void btnOpenActivity (View view){
//            Intent nextActivity = new Intent(this, SatuHalaman.class);
//            startActivity(nextActivity);
//            StartAppAd.showAd(this);
//        }


    }