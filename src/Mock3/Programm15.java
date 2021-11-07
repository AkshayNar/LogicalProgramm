package Mock3;

public class Programm15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		for(int a=1; a<=9; a++)
		{
			for(int b=0;b<=9; b++)
			{
				for(int c=0; c<=9; c++)
				{
					
					int Number = a*100 + b*10 +c;
					
					int g = Number;
					int o=0;;
					
					while(g !=0)
					{
						int reminder = g%10; 
						o = o*10 + reminder;
						g = g/10;
					}
					
					
					if(Number == o)
					{
						System.out.println(Number + " is Palendrom Number");
					}
						
					
				}
			}
		}

	}

}
