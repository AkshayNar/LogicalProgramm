package Mock3;

public class Programm10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {12, 54, 69, 32, 5, 95, 725, 966, 5};
		
		int largeNumber = a[0];
		
		for(int b =0; b<a.length-1; b++)
		{
			if(a[b] > a[b+1])
			{
				largeNumber = a[b];	
				int h = a[b+1];
				a[b+1] = a[b];
				a[b] = h;
			}
			else {
				largeNumber = a[b+1];	
			}
		}
		
		System.out.println(largeNumber +" is large Number");
		

	}

}
