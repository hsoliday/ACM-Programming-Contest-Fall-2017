import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class HunterSolidayProgram10 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner inputScan = new Scanner(System.in);
		String location=inputScan.nextLine();
		inputScan.close();
		
		Scanner fileReader=new Scanner(new File(location));
		LinkedList<String> data=new LinkedList<String>();
		
		while(fileReader.hasNext())
		{
			data.add(fileReader.nextLine());
		}
		
		int size=data.get(0).length();
		char[][] hold=new char[data.size()][size];
		
		for(int i=0;i<data.size();i++)
		{
			for(int j=0;j<size;j++)
			{
				hold[i][j]=data.get(i).charAt(j);
			}
		}
		fileReader.close();
		Stack<Integer> s=new Stack<>();
		interate(1,s,0,0,hold,false);
	}
	public static int charToASCII(char c)
	{
		return (int)c;
	}
	public static char ASCIItoChar(int i)
	{
		return (char)i;
	}
	public static void interate(int direction, Stack<Integer> s,int x, int y, char[][] code, boolean asciiMode)
	{
		if(asciiMode)
		{
			if(code[x][y]=='"')
			{
				move(direction,s,x,y,code, false);
			}
			else
			{
				s.push(new Integer(Integer.parseInt(""+code[x][y])));
				move(direction,s,x,y,code, false);
			}
		}
		else if(code[x][y]=='R')
		{
			move(1,s,x,y,code, false);
		}
		else if(code[x][y]=='U')
		{
			move(2,s,x,y,code, false);
		}
		else if(code[x][y]=='L')
		{
			move(3,s,x,y,code, false);
		}
		else if(code[x][y]=='D')
		{
			move(4,s,x,y,code, false);
		}
		else if((int)code[x][y]<58 && (int)code[x][y]>47)
		{
			s.push(new Integer(Integer.parseInt(""+code[x][y])));
			move(direction,s,x,y,code, false);
		}
		else if(code[x][y]=='"')
		{
			move(direction,s,x,y,code, true);
		}
		else if(code[x][y]=='P')
		{
			System.out.print((char)s.pop().intValue());
				move(direction,s,x,y,code, false);
		}
		else if(code[x][y]=='_')
		{
			move(direction,s,x,y,code, false);
		}
		else if(code[x][y]=='J')
		{
			int i=s.pop().intValue();
			int j=s.pop().intValue();
			int k=s.pop().intValue();
			
			if(i==0);
			{
			if(code[k][j]=='R')
			{
				move(1,s,k,j,code , false);
			}
			else if(code[k][j]=='U')
			{
				move(2,s,k,j,code , false);
			}
			else if(code[k][j]=='L')
			{
				move(3,s,k,j,code , false);
			}
			else if(code[k][j]=='D')
			{
				move(4,s,k,j,code , false);
			}
			else
			{
			move(direction,s,k,j,code , false);
			}
			}
			}
		else if(code[x][y]=='Q')
		{
			return;
		}
		else
		{
			s.push(new Integer(Integer.parseInt(""+(int)code[x][y])));
			move(direction,s,x,y,code , false);
		}
	}
	public static void move(int direction, Stack<Integer> s,int x, int y, char[][] code, boolean asciiMode)
	{
		if(direction==1)
		{
			interate(direction,s,x,y+1,code, false);
		}
		else if(direction==2)
		{
			interate(direction,s,x-1,y,code, false);
		}
		else if(direction==3)
		{
			interate(direction,s,x,y-1,code, false);
		}
		else if(direction==4)
		{
			interate(direction,s,x+1,y,code, false);
		}
	}
}
