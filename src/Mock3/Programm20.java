package Mock3;

public class Programm20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Reverse the string";
		
		char k[] = str.toCharArray();
		
//		for(int p=0; p<str.length(); p++)
//		{
//			k[p] = str.charAt(p);
//		}
		
		for(int u = str.length()-1; u>=0; u--)
		{
			System.out.print(k[u]);
		}
		

	}

}
