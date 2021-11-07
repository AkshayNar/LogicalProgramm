package Mock3;

public class Programm22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {12, 85, 62, 34, 97, 205, 112};
		
		
		for(int k=0; k<(a.length/2); k++)
		{
			int w=a[k];
			
			a[k] = a[(a.length -1) - k];
			
			a[(a.length -1) - k] = w;
		}
		
		for(int m =0; m<a.length; m++)
		{
			System.out.print(a[m] + " ");
		}
		
		
		
		
	}

}
