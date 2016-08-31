package com.lanchuang.wgc.webviewtest1;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class test1 extends Activity
{

	WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);

		setContentView(R.layout.webview);
		webView = (WebView) findViewById(R.id.wv_webview1);
		
		// String url = "https://www.baidu.com/";
		String url = "https://github.com/wgcwgc?tab=repositories";
		// �˷���������webview�д����Ӷ�������ת���ⲿ�����
		webView.setWebViewClient(new WebViewClient());
		webView.setWebChromeClient(new myWebChromeClint());
		webView.loadUrl(url);

	}

	@Override
	public boolean onKeyDown(int keyCode , KeyEvent event )
	{
		// ��дonKeyDown���������ҳ��WebView���Ժ���ʱִ�к��˲�����
		if(keyCode == KeyEvent.KEYCODE_BACK && webView.canGoBack())
		{
			webView.goBack();
			return true;
		}
		return super.onKeyDown(keyCode ,event);
	}

	class myWebChromeClint extends WebChromeClient
	{
		@SuppressWarnings("static-access")
		@Override
		public void onProgressChanged(WebView view , int newProgress )
		{
			if(newProgress == 100)
			{
				view.setVisibility(view.VISIBLE);
				// progressBar.set
			}
			// super.onProgressChanged(view ,newProgress);
		}
	}

}
