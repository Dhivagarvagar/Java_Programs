package clas;
import java.util.*;
public class Armstrong_no_count {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int count=0;
	int sum=0;
	int b=a;
	int c=a;
	while(c>0) {
	count+=1;
	c/=10;
	}
	while(a>0) {
		int e=a%10;
		sum=sum+(int)Math.pow(e, count);
		a/=10;
	}
	if(b==sum) {
		System.out.println("Armstrong");
	}
	else {
		System.out.println("Not an Armstrong");
	}
}
}
