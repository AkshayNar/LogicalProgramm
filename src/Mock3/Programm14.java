package Mock3;

public class Programm14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//LCM      18 and 21          x/18    x/21        18*21 = 378     378/18 = 21     378/21 = 18
		
		int a = 12;
		int b = 16;
		
		if(a>b)
		{
			for(int k=a; k<=a*b; k++)
			{
				if(k%a == 0 && k%b == 0)
				{
					System.out.println("LCM = " + k);
					break;
				}
			}
		}
		else
		{
			for(int k=b; k<=a*b; k++)
			{
				if(k%a == 0 && k%b == 0)
				{
					System.out.println("LCM = " + k);
					break;
				}
			}
		}
		
		
		
		
		
		
		//HCF    18 and 21         x        18/x       21/x     
		
		if(a>b)
		{
			for(int l=b; l>=1; l--)
			{
				if(a%l == 0 && b%l == 0)
				{
					System.out.println("HCF = "+l);
					break;
				}
			}
		}
		else
		{
			for(int l=a; l>=1; l--)
			{
				if(a%l == 0 && b%l == 0)
				{
					System.out.println("HCF = "+l);
					break;
				}
			}
		}
		
		
		
		

	}

}
