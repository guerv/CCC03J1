import java.util.Scanner;


public class Trident {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);

		int t = 0, s = 0, h = 0, line=0;

		t = scan.nextInt();
		s = scan.nextInt();
		h = scan.nextInt();
		
		line = 3 + (2*s);

		for (int i = 0; i < t; i++)
		{
			for (int k = 0; k < 3; k++)
			{
				System.out.print("*");

				for (int j = 0; j < s; j++)
				{
					if (k ==2)
						break; 
					
					System.out.print(" ");
				}
			}

			System.out.println(); 
		}
		
		
		for (int i =0; i < line; i++)
		{
			System.out.print("*");
		}
		
		System.out.println(); 
		
		for (int i = 0; i < h; i++)
		{
			for (int j = 0; j < (line/2); j++)
			{
				System.out.print(" ");

			}
			
			System.out.println("*");

		}

		

		scan.close();
	}

}
