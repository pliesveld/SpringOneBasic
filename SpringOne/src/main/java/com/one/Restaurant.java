package com.one;

public class Restaurant 
{
	private HotDrink hotdrink;
	
	public Restaurant(HotDrink hotdrink) {
		super();
		this.hotdrink = hotdrink;
	}
	
	public void prepaireDrink()
	{
		hotdrink.prepairDrink();
	}

	
}
