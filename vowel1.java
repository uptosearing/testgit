package application;
import java.util.Scanner;
public class vowel {

	public static void main(String[] args) {
String s="";
int i,count=0;
Scanner vc= new Scanner(System.in);
try
{
	System.out.println("enter String");
	s=vc.nextLine();
}
catch(Exception e)
{
	System.out.println("error");
	
}
for(i=1;i<s.length();i++)
{
	char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;
			}
}
System.out.println("vowels="+count);
	}

}
