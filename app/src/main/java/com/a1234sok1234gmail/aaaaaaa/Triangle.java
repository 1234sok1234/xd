package com.a1234sok1234gmail.aaaaaaa;

public class Triangle extends Obje
{
	public double uniqueID;
	private String name = "triangle";
	private String field;
	private String attri;

	public Triangle(String name, String field, String attri)
	{
		this.setuniqueID();
		this.setField(uniqueID);
		this.field = getfield();
		this.name = getName();
		this.attri = getattri();
	}

	public String getfield()
	{
		return field;
	}

	public String getattri()
	{
		return attri;
	}

	public void setuniqueID()
	{
		double minnum = 0;
		double maxnum = 1;
		this.uniqueID = minnum + (double) (Math.random() * ((maxnum - minnum)));
		//System.out.println("Unique ID set to: " + this.uniqueID);
		double number = (int) Math.round(this.uniqueID * 1000) / (double) 1000;
		this.attri=Double.toString(number);
		//System.out.println(number);
	}

	public double getUniqueID()
	{
		return uniqueID;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getField()
	{

		return field;
	}

	public void setField(double uniqueID)
	{
		double x;
		x = (((4 * this.uniqueID * this.uniqueID) / 3) * 1.73205) / 4;
		double number = (int) Math.round(x * 1000) / (double) 1000;
		this.field = Double.toString(number);
		//System.out.print((int) Math.round(this.field * 1000) / (double) 1000);
	}
}
