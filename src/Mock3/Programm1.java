package Mock3;

import java.util.Scanner;

public class Programm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThreDigitsArmstrongNumbers();
		
		IsitArmstrongNumberOrNot();
			
		
	}
	

	

	private static void IsitArmstrongNumberOrNot() {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		int k = number;
		
		int power = (String.valueOf(number)).length();
		
		int Amst=0;
		while(k != 0)
		{
			int b = k%10;
			 Amst = (int) (Amst + Math.pow(b, power));
			
			k = k/10;
		}
		
		
		if(number == Amst)
		{
			System.out.println("This Number is Armstrong Number");
		}
		else
		{
			System.out.println("This is not an armstrong number");
		}
		
		
		
		
		
	}


	private static void ThreDigitsArmstrongNumbers() {
		// TODO Auto-generated method stub
		
		
		for(int a=1; a<=9; a++)
		{
			for(int b=0; b<=9; b++)
			{
				for(int c=0; c<=9; c++)
				{
					int Number = a*100 + b*10 + c;
					
					int Amst = a*a*a + b*b*b + c*c*c;
					
					if(Number == Amst)
					{
						System.out.println(Number + " is Armstrong Number");
					}
				}
			}
		}
		
	}

}
