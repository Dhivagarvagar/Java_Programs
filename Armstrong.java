package clas;
import java.util.*;
public class Armstrong {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int sum=0;
	int b=a;
	while(a>0) {
		int c=a%10;
		sum=sum+(c*c*c);
		a/=10;
		System.out.println(c+" "+sum+" "+a+" ");
	}
	if(b==sum) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
}
}
