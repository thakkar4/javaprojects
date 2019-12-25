package javaproject;

//Write a program to find biggest among 5 numbers;
public class Biggest{

public static void main (String [] args) {

		int a = 23;
		int b = 19;
		int c = 21;
		int d = 35;
		int e = 40;

		if (a>b && a>c&& a>d && a>e)
		System.out.println(" Biggest is : " + a); 
		else if (b>c && b>a && b>d && b>e)
		System.out.println("Biggest is: " + b);
		else if (c>d)
		System.out.println("Biggest is : " +c);	
		else if (d>e)
		System.out.println("Biggest is : " +d);	
		else
		System.out.println("Biggest is : " +d);
		

}
}