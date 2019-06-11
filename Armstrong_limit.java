package clas;
import java.util.*;
public class Armstrong_limit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int count=0;
	for(int i=a+1;i<b;i++) {
		count=0;
		int c=i;
		while(c>0) {
			count++;
			c/=10;
		}
		int d=i;
		int e=0;
		int sum=0;
		while(d>0) {
			e=d%10;
			sum+=(int)Math.pow(e, count);
			d/=10;
		}
		if(i==sum) {
			System.out.print(sum+" ");
		}
	}
	
}
}
