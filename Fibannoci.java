package Try;
import java.util.*;
public class Fibannoci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=1;
	int b=1;
	int c=1;
	int n=sc.nextInt();
	System.out.print(a+" "+b+" ");
	for(int i=3;i<=n;i++){
		 c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
	}
}
}
