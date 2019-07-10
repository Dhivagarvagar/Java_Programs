package NewTry;
import java.util.*;
public class Perfect_Square {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int M=sc.nextInt();
	int a=N*M;
	boolean b=false;
	for(int i=1;i<a;i++) 
	{
		if(Math.sqrt(a)%i==0) 
		{
			b=true;
			break;
		}
	}
	if(b) 
	{
		System.out.println("yes");
	}
	else 
	{
		System.out.println("no");
	}
}
}
