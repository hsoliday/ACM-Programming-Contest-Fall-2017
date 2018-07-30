import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class HunterSolidayProblem4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String location=scan.nextLine();
		Scanner scan2=new Scanner(new File(location));
		LinkedList<String> l=new LinkedList<String>();
		while(scan2.hasNext())
		{
			l.add(scan2.nextLine());
		}
		

	}
	public static String[] parseNext(String str){
		String tmp="";
		char[]c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
			{
				break;
			}
			else
			{
				tmp+=c[i];
			}
		}
		
		String[] ret={tmp, str.substring(tmp.length()+1)};
		return ret;

}
