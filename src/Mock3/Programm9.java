package Mock3;

public class Programm9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a[] = {"Akshay", "gayatri", "Akash", "Nikita", "Rahul", "Nikita", "gayatri"};
		
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
