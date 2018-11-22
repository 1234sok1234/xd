package com.a1234sok1234gmail.aaaaaaa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonListAdapter extends ArrayAdapter<Obje>
{
	private static ImageView imgview;
	private Context mContext;
	private int mResource;

	public PersonListAdapter(Context context, int resource, ArrayList<Obje> objects)
	{
		super(context, resource, objects);
		mContext = context;
		mResource = resource;
	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		int t=0;
		int c=0;
		int s=0;
		String name = getItem(position).getName();
		String field = getItem(position).getfield();
		String attri = getItem(position).getattri();

		//Create the person object with the information
		Obje xd[]=new Obje[3];
		xd[0] =new Square(name,field,attri);
		xd[0] =new Triangle(name,field,attri);
		xd[0] =new Circle(name,field,attri);
		xd[0] =new Empty(name,field,attri);

		//Figure figure = new Figure(name, field, attri);
		LayoutInflater inflater = LayoutInflater.from(mContext);
		convertView = inflater.inflate(mResource, parent, false);

		ImageView tvName = (ImageView) convertView.findViewById(R.id.figureimage);
		//TextView tvName=(TextView) convertView.findViewById(R.id.textView1);
		TextView tvfield = (TextView) convertView.findViewById(R.id.textView2);
		TextView tx=(TextView) convertView.findViewById(R.id.textView6);
		TextView sx=(TextView) convertView.findViewById(R.id.textView7);
		TextView cx=(TextView) convertView.findViewById(R.id.textView8);


		TextView tvattri = (TextView) convertView.findViewById(R.id.textView3);
		TextView tvtype = (TextView) convertView.findViewById(R.id.textView4);
		if (name == "circle")
		{
			tvName.setImageResource(R.drawable.circle);
			tvtype.setText("średnica");
			c++;
			//cx.setText(c);
		} else if (name == "square")
		{
			tvName.setImageResource(R.drawable.square);
			tvtype.setText("przekątna");
			s++;
			//sx.setText(s);
			//MainActivity.tian();
			//imgview=(ImageView)v.findViewById(R.id.figureimage);
			//imgview.setImageResource(R.drawable.aaa);
		} else if (name == "triangle")
		{
			tvName.setImageResource(R.drawable.triangle);
			tvtype.setText("wysokość");
			t++;
			//tx.setText(t);
			//MainActivity.tian();
			//imgview=(ImageView)v.findViewById(R.id.figureimage);
			//imgview.setImageResource(R.drawable.aaa);
		} else
		{
			tvName.setImageResource(R.drawable.blank);
			tvtype.setText("");
		}
		tvfield.setText(field);
		tvattri.setText(attri);

		return convertView;
	}
}
