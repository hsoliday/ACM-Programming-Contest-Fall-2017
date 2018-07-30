import java.util.Scanner;

public class HunterSolidayProblem3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp=scan.nextLine();
		String hold=""+tmp.charAt(0);
		tmp=tmp.substring(2);
		String[] str=new String[Integer.parseInt(hold)];
		for(int i=0;i<str.length-1;i++)
		{
			str[i]=parseNext(tmp)[0];
			tmp=parseNext(tmp)[1];
		}
		str[str.length-1]=tmp;
		for(int i=0;i<str.length;i++)
		{
			System.out.println(invert(str[i])+" "+str[i]);
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
	public static String invert(String str)
	{
		String jk="";
			for(int i=str.length()-1;i>=0;i--)
			{
			jk+=str.charAt(i);	
			}
		
		return jk;
	}
	

}
