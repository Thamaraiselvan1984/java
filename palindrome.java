package JAVACODING;

import java.util.Scanner;

public class palindrome {
    
    public static void main(String args[]) {
    	Scanner reader = new Scanner(System.in);
    	System.out.println("Enter a Number");
    	int r, sum=0, temp;
        int n = reader.nextInt();
        temp=n;
        while(n>0) {
        	r=n%10;
        	sum=(sum*10)+r;
        	n=n/10;
        }
    if(temp==sum)
    System.out.println("Palindrome number");
    else
    System.out.println("Not a Palindrome number");
    }    
}
