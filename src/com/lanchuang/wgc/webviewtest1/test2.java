package com.lanchuang.wgc.webviewtest1;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;
import android.widget.Toolbar;

public class test2 extends Activity
{

	WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		Toolbar tb = (Toolbar) findViewById(R.id.toolbar1);

		tb.setTitle("我是标题");
		tb.setNavigationIcon(android.R.id.icon1);
		tb.setLogo(android.R.id.icon2);
		setActionBar(tb);
		tb.setNavigationOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View v )
			{
				Toast.makeText(test2.this ,"事件相应" ,Toast.LENGTH_LONG).show();
			}
		});

		// webView = (WebView) findViewById(R.id.wv_webview1);
		//
		// // String url = "https://www.baidu.com/";
		// String url = "https://github.com/wgcwgc?tab=repositories";
		// // 此方法可以在webview中打开链接而不会跳转到外部浏览器
		// webView.setWebViewClient(new WebViewClient());
		// webView.setWebChromeClient(new myWebChromeClint());
		// webView.loadUrl(url);

	}

	@Override
	public boolean onKeyDown(int keyCode , KeyEvent event )
	{
		// 重写onKeyDown，当浏览网页，WebView可以后退时执行后退操作。
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
