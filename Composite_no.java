package NewTry;
import java.util.*;
public class Composite_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	boolean b=true;
	for(int i=2;i<a;i++) 
	{
		if(a%i==0) 
		{
			b=false;
			break;
		}
	}
	if(!b) 
	{
		System.out.println("yes");
	}
	else 
	{
		System.out.println("no");
	}
}
}
