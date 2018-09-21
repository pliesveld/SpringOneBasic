package com.setterConstructorInjection;

public class Triangle
{
	private String type;
	private int heigth;
	public Triangle(String type) {
		super();
		this.type = type;
	}

	public Triangle(String type, int heigth) {
		super();
		this.type = type;
		this.heigth = heigth;
	}

	public String getType() {
		return type;
	}

	/*public void setType(String type) {
		this.type = type;
	}*/
	
	public int getHeigth() {
		return heigth;
	}
	
	public void draw ()
	{
		System.out.println(getType()+" Traingle has been Drawn of "+getHeigth());
	}

	
}
