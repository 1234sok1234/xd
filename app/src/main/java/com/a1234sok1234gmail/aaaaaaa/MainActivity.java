package com.a1234sok1234gmail.aaaaaaa;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
	int nof = 50;
	int fgg=1;
	private static String tag = "void";
	//private static ImageView imgview;
	MyDBHandler dbHandler;
	//private int current_image;
	//static int[]  images={R.drawable.aaa,R.drawable.kkk};
	private static final String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar2);
		setSupportActionBar(mToolbar);
		TextView ilosct = (TextView) findViewById(R.id.textView6);
		Log.d(tag, "onCreate: Started.");
		ListView mListView = (ListView) findViewById(R.id.listView);
		dbHandler = new MyDBHandler(this, null, null, 1);
		String dbString = dbHandler.getbyid(0);
		int t = 0;
		int c = 0;
		int s = 0;
		//int x=500;
		dbHandler.ddb();
		ProductsDB productsDB = new ProductsDB(dbString);
		dbHandler.addProduct(productsDB);
		ProductsDB productsDBc = new ProductsDB(Integer.toString(0));
		dbHandler.addProduct(productsDBc);
		int x = Integer.parseInt(dbString);
		Obje xd[] = new Obje[x + 1];
		double ko;
		int xxxx;
		int xx;
		xd[0] = new Empty("", "", "");
		for (int i = 1; i < x + 1; i++)
		{
			ko = (Math.random() * 1000);
			xxxx = (int) ko;
			xx = xxxx % 3;
			if (xx == 0)
			{
				xd[i] = new Square("Square", "asdasd", "koko");
				s++;
			} else if (xx == 1)
			{
				xd[i] = new Triangle("circle", "asdasd", "koko");
				t++;
			} else
			{
				xd[i] = new Circle("circle", "asdasd", "koko");
				c++;
			}
		}

		productsDB = new ProductsDB(Integer.toString(s));
		dbHandler.addProduct(productsDB);
		productsDB = new ProductsDB(Integer.toString(t));
		dbHandler.addProduct(productsDB);
		productsDB = new ProductsDB(Integer.toString(c));
		dbHandler.addProduct(productsDB);
		//ilosct.setText(Integer.toString(t));
		//Add the Person objects to an ArrayList
		ArrayList<Obje> peopleList = new ArrayList<>();
		for (int i = 0; i < x + 1; i++)
		{
			peopleList.add(xd[i]);
		}


		PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, peopleList);
		mListView.setAdapter(adapter);

	}

	public void x1(View view)
	{
		Log.d(AppSe.tagg, "x1");

	}

	public void x2(View view)
	{
		Log.d(AppSe.tagg, "x2");

	}

	public void x3(View view)
	{
		Log.d(AppSe.tagg, "x3");

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater mMenuInflater = getMenuInflater();
		mMenuInflater.inflate(R.menu.my_menu, menu);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item)
	{
		if (item.getItemId() == R.id.action_setting)
		{
			startActivity(new Intent(MainActivity.this, Settings.class));
			//Intent intent = new Intent("android.intent.action.Settings");
			//startActivity(intent);
		} else if (item.getItemId() == R.id.action_stat)
		{
			startActivity(new Intent(MainActivity.this, Stats.class));
			//Intent intent = new Intent("android.intent.action.Stats");
			//startActivity(intent);

		} else
		{

		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void onResume()
	{
		String dbStringt = dbHandler.getbyid(1);
		Log.d(AppSe.tagg, "..");
		Log.d(AppSe.tagg, dbStringt);
		Log.d(AppSe.tagg, "cd");
		String cpp="-1";
		if(dbStringt.matches(cpp))
		{
			Log.d(AppSe.tagg, "weszlismy");
			this.recreate();
		}
		super.onResume();
	}

	public void xd()
	{
		this.recreate();
	}

	@Override
	public void recreate()
	{
		super.recreate();
	}
}
