package clas;
import java.util.*;
public class Power_of_2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	boolean b=false;
	for(int i=1;i<=a;i++) {
		System.out.println(i);
		int temp=(int)Math.pow(2, i);
		System.out.println(temp);
		if(temp==a) {
			b=true;
			break;
		}
		if(temp>a) {
			break;
		}
	}
	if(b) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
}
}
