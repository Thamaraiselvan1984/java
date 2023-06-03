package JAVACODING;
import java.io.*;
public class operators 
{
	public static void main(String[] args) 
	{
		 int x = 8, y = 5, z = 9;
		 System.out.println("Demonstrating & operator");
		 if((x<y)&(x++<z));
		 else
			 System.out.println("value of x:" +x);
		 
		 String txt = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("the text is :" + txt);
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	    cars[0] = "Opel";
	    System.out.println(cars[2]);
	}
}
