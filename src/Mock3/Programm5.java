package Mock3;

import java.util.Scanner;

public class Programm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	//	FibonacciSeriesUptoPrticularDigit();
		
	    FibonacciSeriesUptoPreticularNumber();

	}

	private static void   FibonacciSeriesUptoPreticularNumber() {
		// TODO Auto-generated method stub
		
		
		Scanner scr = new Scanner(System.in);
		
		int k = scr.nextInt();
		
		scr.close();
		
		int a = 0;
		int b = 1;
		
		System.out.print(a +", "+b);
		int l =0;
		int c = 0;
		
		while(l < k)
		{
			if(c < k)
			{
				c= a+b;
				
				if(c<k)
				{
					System.out.print(", "+ c);
				}
				else
				{
					break;
				}
				
				a = b;
				b = c;
				l++;
							
			}
			
		}
	
	}
	
	
	
	

	public static void FibonacciSeriesUptoPrticularDigit() {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		int k = scr.nextInt();
		
		scr.close();
		
		int a = 0;
		int b = 1;
		
		System.out.print(a +", "+b);
		
		for(int v=2; v<k; v++)
		{
			int c= a+b;
			System.out.print(", "+ c);
			a = b;
			b = c;
			
		}
		
		
	}

}
