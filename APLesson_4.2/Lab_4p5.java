import java.util.Scanner;

public class Lab_4p5
{
	//Statics
	static double l;
	static double w;
	static double perimiter;
	
	public static void main(String[]args)
	{
		//Function #5
		System.out.println("*Rectangle Perimiter*");
		
		//Scanners 
		Rectangle A = new Rectangle();
		Scanner up = new Scanner(System.in);
		
		//Imputs
		System.out.println("IMPUT LENGTH");
		l =  up.nextDouble();
		up.nextLine();
		System.out.println("IMPUT WIDTH");
		w =  up.nextDouble();
		up.nextLine();
		
		perimeter = A.PerimCalc(l, w);
		
		A.print(perimeter);
		
	}
		//Calculator
	public double PerimCalc(double l, double w)
	{
		return = 2*l + 2*w);
	}
	public static void print(double perimiter)
	{
		//prints
		System.out.println("Your rectangle is " + perimiter + "sq ft around. ");
	}
}