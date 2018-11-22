package com.a1234sok1234gmail.aaaaaaa;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Stats extends AppCompatActivity
{
	MyDBHandler dbHandler;

	TextView outputt;
	TextView outputs;
	TextView outputc;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stats);
		Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar3);
		mToolbar.setNavigationIcon(R.drawable.ic_arrow);
		mToolbar.setTitle(R.string.menu_stats);
		setSupportActionBar(mToolbar);
		outputt = (TextView) findViewById(R.id.textView6);
		outputs = (TextView) findViewById(R.id.textView7);
		outputc = (TextView) findViewById(R.id.textView8);
		dbHandler = new MyDBHandler(this, null, null, 1);
		printDatabase();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater mMenuInflater = getMenuInflater();
		mMenuInflater.inflate(R.menu.back_menu, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item)
	{
		if (item.getItemId() == R.id.action_setting)
		{
			startActivity(new Intent(Stats.this,Settings.class));
			//Intent intent = new Intent("android.intent.action.Settings");
			//startActivity(intent);
		}else
		{

		}
		return super.onOptionsItemSelected(item);
	}
	public void printDatabase()
	{
		String dbString = dbHandler.getbyid(2);
		outputt.setText(dbString);
		String dbStringg = dbHandler.getbyid(3);
		outputs.setText(dbStringg);
		String dbStringgg = dbHandler.getbyid(4);
		outputc.setText(dbStringgg);
	}
}
