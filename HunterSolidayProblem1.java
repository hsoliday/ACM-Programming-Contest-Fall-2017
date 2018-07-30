// Hunter Soliday acm program 1, JAVA
import java.util.Scanner;

public class HunterSolidayProblem1 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String tmp=scan.nextLine();
		String tmp2="";
		for(int i=tmp.length()-1;i>=0;i--)
		{
		tmp2+=tmp.charAt(i);	
		}
		
		for(int i=0;i<tmp2.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			System.out.println(tmp2.charAt(i));
		}
		

	}

}
