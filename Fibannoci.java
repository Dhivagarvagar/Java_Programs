package Try;
import java.util.*;
public class Fibannoci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=0,b=0,c=1;
	System.out.print(c+" ");
	for(int i=2;i<=n;i++){
		a=b;
		b=c;
		c=a+b;
		System.out.print(c+" ");
		}
}
}
