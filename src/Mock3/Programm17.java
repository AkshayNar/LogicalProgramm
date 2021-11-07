package Mock3;

public class Programm17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {4, 7, 15, 17, 18, 21, 29, 31};
		
		
		for(int k=0; k<a.length; k++)
		{
			int count=0;
			
			for(int p = a[k]; p>=1; p--)
			{
				if(a[k]%p ==0)
				{
					count = count +1;
				}	
			}
			if(count > 2)
			{
				
			}
			else
			{
				System.out.println(a[k] + " is Prime Number");
			}
		}
		
		
	}

}
