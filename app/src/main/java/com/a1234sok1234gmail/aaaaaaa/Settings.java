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

public class Settings extends AppCompatActivity
{
	MyDBHandler dbHandler;
	TextView output;
	EditText input;
	EditText numerrr;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);

		Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
		mToolbar.setNavigationIcon(R.drawable.ic_arrow);
		mToolbar.setTitle(R.string.menu_action_setting);
		setSupportActionBar(mToolbar);
		input = (EditText) findViewById(R.id.editTextc);
		output = (TextView) findViewById(R.id.texxxt);
		dbHandler = new MyDBHandler(this, null, null, 1);
		printDatabase();

	}

	public void yy1(View view)
	{
		ProductsDB productsDB = new ProductsDB(input.getText().toString());
		dbHandler.addProduct(productsDB);
		printDatabase();
		//TextView x = (TextView) findViewById(R.id.texxxt);

		//	x.setText("");

		//Log.d(AppSe.tagg, "yy1");
	}

	public void xxcc(View view)
	{
		String inputText = input.getText().toString();
		dbHandler.deleteProduct(inputText);
		printDatabase();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater mMenuInflater = getMenuInflater();
		mMenuInflater.inflate(R.menu.back_fromsettings_menu, menu);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item)
	{
		if (item.getItemId() == R.id.action_stat)
		{
			startActivity(new Intent(Settings.this, Stats.class));
			//Intent intent = new Intent("android.intent.action.Settings");
			//startActivity(intent);
		} else
		{

		}
		return super.onOptionsItemSelected(item);
	}

	public void printDatabase()
	{
		String dbString = dbHandler.databaseToString();
		output.setText(dbString);
		input.setText("");
	}

	public void setnum(View view)
	{

		String dbStringn = dbHandler.getbyid(0);

		String dbStringt = dbHandler.getbyid(2);

		String dbStrings = dbHandler.getbyid(3);

		String dbStringc = dbHandler.getbyid(4);
		Log.d(AppSe.tagg, "przed");
		dbHandler.ddb();
		Log.d(AppSe.tagg, "po");
		numerrr=(EditText)findViewById(R.id.nuberof);
		String xxxxxx=numerrr.getText().toString();
		ProductsDB productsDB = new ProductsDB(xxxxxx);
		dbHandler.addProduct(productsDB);
		ProductsDB productsDBx = new ProductsDB(Integer.toString(-1));
		dbHandler.addProduct(productsDBx);
	}
}
