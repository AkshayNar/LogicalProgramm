package Mock3;

public class Programm13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a = 14;
		int b = 15;
		int c = 13;
		int d = 18;
		int k;
		
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is large Number");
				k=a;
			}
			else
			{
				System.out.println("C is large Number");
				k=c;
			}
		}
		else
		{
			if(b>c)
			{
				//System.out.println("B is larger Number");
				k=b;
			}
			else
			{
				System.out.println("C is larger Number");
				k=c;
			}
		}
		
		
		
		
		
		if(k>d)
		{
			System.out.println(k +" is larger Number");
		}
		else
		{
			System.out.println("d is large Number");
		}

	}

}
