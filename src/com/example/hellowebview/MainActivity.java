package com.example.hellowebview;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	WebView mWebView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mWebView = (WebView) findViewById(R.id.webview);
		
		//Create Simple HTML
		mWebView.loadUrl("file:///android_asset/index.html");
		mWebView.setWebViewClient(new WebViewClient());
		//mWebView.loadUrl("file:///Users/roywong/Documents/workspace/HelloWebView/assets/index.html");
		
		//mWebView.getSettings().setJavaScriptEnabled(true);
		//mWebView.getSettings().setBuiltInZoomControls(true);
		//mWebView.loadUrl("http://www.google.com");

		//mWebView.setWebViewClient(new WebViewClient());

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
			mWebView.goBack();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
