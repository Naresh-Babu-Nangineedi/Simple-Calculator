package com.epam3.Simple_Calculator;

import java.util.Scanner;
public class Calculator{
    private static Scanner scan;

	public static void main(String[] args) {
    	scan = new Scanner(System.in);
    	while(true){
    		System.out.println("Simple-Calculator\n1.ADDITION\n2.SUBSTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.EXIT");
    		System.out.print("Enter the Option:-");
    		int opt=scan.nextInt();
    		double a,b;
    		switch(opt){
            	case 1:
                	System.out.println("ENTER THE TWO NUMBERS:");
                    a=scan.nextDouble();
                    b=scan.nextDouble();
                    Addition ad=new Addition(a,b);
                    double c = ad.add();
                    System.out.println("ADDITION OF TWO NUMBERS: "+c);
                    break;
            	case 2:
                	System.out.println("ENTER THE TWO NUMBERS:");
                    a=scan.nextDouble();
                    b=scan.nextDouble();
                    Subtraction sub=new Subtraction(a,b);
                    double d = sub.subtract();
                    System.out.println("SUBTRACTION OF TWO NUMBERS: "+d);
                    break;
            	case 3:
                	System.out.println("ENTER THE TWO NUMBERS:");
                    a=scan.nextDouble();
                    b=scan.nextDouble();
                    Multiplication mul = new Multiplication(a,b);
                    double e = mul.multi();
                    System.out.println("MULTIPLICATION OF TWO NUMBERS: "+e);
                    break;
            	case 4:
                	System.out.println("ENTER THE TWO NUMBERS:");
                    a=scan.nextDouble();
                    b=scan.nextDouble();
                    Division div=new Division(a,b);
                    div.divide();
                    break;
            	case 5:
    				return ;
            	default :
                    System.out.println("INVALID OPTION");
                    return;
    		}
    	}
    }
}