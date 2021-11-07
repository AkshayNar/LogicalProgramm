package Mock3;

public class Programm18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {5, 92, 75, 120, 65, 854, 625, 235};
		
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] < a[j])
				{
					int h = a[i];
					a[i]= a[j];
					a[j]=h;
				}
			}
		}
		
		for(int m=0; m<a.length; m++)
		{
			System.out.print(a[m] + ", ");
		}
		
	}

}
