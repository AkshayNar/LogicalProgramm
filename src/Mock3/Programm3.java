package Mock3;

public class Programm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//CountingCharactersIncludingSpace();
		CountingCharactersWithoutSpace();

	}

	private static void CountingCharactersWithoutSpace() {
		// TODO Auto-generated method stub
		
		String str = "Akshay is good boy";
		
		int k = str.length();
		
		int count=0;
		
		for(int a=0; a<k; a++)
		{
			if(str.charAt(a) != ' ')
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
	}

	private static void CountingCharactersIncludingSpace() {
		// TODO Auto-generated method stub
		
		
		
		String str = "Akshay cewn n eakfa fonefn";
		
		System.out.println(str.length());
		
	}

}
