package JAVACODING;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) 
	{
		Scanner reverse = new Scanner(System.in);
		System.out.println("Enter a string/number to check reverse");
	    String str = reverse.next();
	    char ch;
	    String nstr = " ";
	    for (int i=0; i<str.length(); i++)
	    {
          ch = str.charAt(i);
          nstr = ch + nstr;
	    }         
         System.out.println("Reversed word/number is:"+ nstr); 
      }
}
