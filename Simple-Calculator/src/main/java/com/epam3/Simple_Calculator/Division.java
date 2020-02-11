package com.epam3.Simple_Calculator;

public class Division {
	double a;
	double b;
	Division(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	void divide()
	{
		try
		{
		System.out.println("DIVISION OF TWO NUMBERS: "+(this.a/this.b));
		}
		catch (ArithmeticException e) 
		{
	         System.out.println ("Can't be divided by Zero"+e);
	    }
	}
}