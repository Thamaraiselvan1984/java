package JAVACODING;

import java.util.Scanner;

public class evenandodd 
{
	

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = reader.nextInt();
		if(num % 2 == 0)
	    	System.out.println(num + " IS EVEN NUMBER");
	    else
	    	System.out.println(num + " IS ODD NUMBER");
	}
}
