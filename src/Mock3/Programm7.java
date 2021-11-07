package Mock3;

import java.util.Scanner;

public class Programm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scr = new Scanner(System.in);
		
		int a =scr.nextInt();
		int fact=1;
		for(int b =a; b>=1; b--)
		{
			fact = fact *b;
		}
		
		System.out.println("Factorial of "+ a + " is " + fact);
		

	}

}
