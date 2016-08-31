package com.lanchuang.wgc.webviewtest1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void test1(View v )
	{
		Intent intent = new Intent(this , test1.class);
		startActivity(intent);
	}

	public void test2(View v )
	{
		Intent intent = new Intent(this , test2.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu )
	{
		getMenuInflater().inflate(R.menu.main ,menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item )
	{
		int id = item.getItemId();
		if(id == R.id.action_settings)
		{
			Toast.makeText(this ,"…Ë÷√" ,Toast.LENGTH_LONG).show();
			return true;
		}
		else
			if(id == android.R.id.home)
			{
				onBackPressed();
				return true;
			}

		return super.onOptionsItemSelected(item);
	}
	
}

