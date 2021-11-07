package Mock3;

public class Programm16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int a = 1; a<=100; a++)
		{
			int count=0;
			
			for(int k = a; k>=1; k--)
			{
				if(a%k ==0)
				{
					count = count +1;
				}	
			}
			if(count > 2)
			{
				
			}
			else
			{
				System.out.println(a + " is Prime Number");
			}
		}
		
		

	}

}
