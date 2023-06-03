package JAVACODING;

public class febonacci {

	public static void main(String[] args) {
		int n=10;
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		int i;
		for(i=0; i<n; i++)
		{
		 n1 = n2;
	     n2 = n3;
	     n3 = n1 + n2;
		
	   System.out.println((n3));
	}
}
}
