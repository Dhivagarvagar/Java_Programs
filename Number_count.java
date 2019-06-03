package clas;
import java.util.*;
public class Number_count {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int count=0;
	int count1=0;
	while(a>0) {
		a/=10;
		count=count + 1;
	}
	while(b>0) {
		b/=10;
		count1=count1 + 1;
	}
	if(count==2 &&count1==3) {
		System.out.println("yes");
	}
	else {
		System.out.println("No");
	}
}
}
