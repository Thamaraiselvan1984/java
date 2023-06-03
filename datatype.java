package JAVACODING;
import java.util.ArrayList;
import java.util.LinkedList;
public class datatype 
{
	public static void main(String[] args)
	{
		System.out.println("hello");
		String name = "john";
		System.out.println("Hello"+name);
		String firstName = "John";
		String lastName = "Doe";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		int mynum;
		mynum = 15;
		System.out.println(mynum);
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars.get(3));
	    
	    LinkedList<String> cars1 = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars.get(2));
	}
}
