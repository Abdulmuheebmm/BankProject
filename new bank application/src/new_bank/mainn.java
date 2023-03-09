package new_bank;

import java.util.Scanner;

public class mainn {

	public static void main(String [] args)
	{
		new_bank nb=new new_bank();
		Scanner sc = new Scanner(System.in);
		
		boolean flag=true;
		
		while(flag)
		{
			System.out.println("1 SIGN IN \n2 SIGN UP \n3EXIT");
			switch(sc.nextInt())
			{
			case 1:
			{
				System.out.println("ENTER THE NAME ");
				String x=sc.next();
				System.out.println("ENTER THE PASSWORD ");
				String y=sc.next();
				nb.login(x,y);
			}break;
			
			case 2:
			{
				System.out.println("ENTER THE NAME ");
				String a=sc.next();
				System.out.println("ENTER THE PASSWORD ");
				String b=sc.next();
				System.out.println("ENTER THE PHONE ");
				long c=sc.nextLong();
				System.out.println("ENTER THE EMAIL ");
				String d=sc.next();
				nb.signup(a, b, c, d);
			}break;
			
			case 3:
			{
				System.exit(0);
			}
			
			
			}
		}
		
	}
}
