import java.util.Scanner;
public class Lab_7
{
	static int number;
	static int digits = 0;
	static int sum = 0;
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("-DigitAdder-");
		System.out.println("please input a number");
		number = kb.nextInt();
		sumDigits();
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	
	public static void sumDigits()
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			num /= 10; 
		}
	}
}