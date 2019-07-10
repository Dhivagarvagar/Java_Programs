package NewTry;
import java.util.*;
public class Print_odd_no 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	char [] b=(""+a).toCharArray();
	for(int i=0;i<b.length;i++) 
	{
		if(b[i]%2==1) {
			System.out.print(b[i]+" ");
		}
	}
}
}
