package com.epam3.Simple_Calculator;

public class Addition {
	double a;
	double b;
	Addition(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	double add()
	{
		return (this.a+this.b);
	}
}