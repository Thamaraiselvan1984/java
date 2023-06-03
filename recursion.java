package JAVACODING;
import java.util.*;

public class recursion 
{
			public static void main(String[] args) 
			{ 
		    sayHi(4);
		  }
private static void sayHi(int count)
{
	System.out.println("HI");
	if(count<=1)
	{
		return;
	
	}
	sayHi(count -1);
		  }
		}
