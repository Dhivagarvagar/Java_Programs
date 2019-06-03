package clas;
import java.util.*;
public class Power {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=1;
	while(b!=0) {
		c*=a;
		--b;
	}
	System.out.println(c);
}
}
