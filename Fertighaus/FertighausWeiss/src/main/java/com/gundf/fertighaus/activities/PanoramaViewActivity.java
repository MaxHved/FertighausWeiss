package com.gundf.fertighaus.activities;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.gundf.fertighaus.R;
import com.gundf.fertighaus.models.panoramas.PanoramaItemContent;

public class PanoramaViewActivity extends Activity {

    private PanoramaItemContent mPanoramaItemContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panorama_view);
        mPanoramaItemContent = getIntent().getParcelableExtra(PanoramaItemContent.EXTRA_PANORAMA_ITEM_CONTENT);
        initWebView();
        initActionBar();
    }

    private void initWebView() {
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.setWebViewClient(new MyWebViewClient());
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setAppCacheEnabled(true);
        webView.loadUrl(mPanoramaItemContent.getUrl());
    }

    private void initActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(mPanoramaItemContent.getName());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        //show the web page in webview but not in web browser
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl (url);
            return true;
        }
    }
}
