package com.factoryMethodInjection;

public class PrintFactory 
{
	public static Printer getPrinter()
	{
		return new Printer();
	}
}
