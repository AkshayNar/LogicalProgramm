package Mock3;

import java.util.Scanner;

public class Programm21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scr = new Scanner(System.in);
		String str = scr.nextLine();
		
		String k[] = str.split(" ");
		

		for(int s=0; s<k.length; s++)
		{
			char a[] = k[s].toCharArray();
			
			for(int g=a.length-1; g>=0; g--)
			{
				System.out.print(a[g]);
			}
			
			System.out.print(" ");
			
		}
		
		
		
	}

}
