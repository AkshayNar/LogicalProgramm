package Mock3;

public class Programm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {12, 25, 45, 25, 95, 63, 63};
		
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println(a[i] +" is duplicate");
				}
			}
		}
		
		
	}

}
