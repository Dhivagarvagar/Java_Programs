package clas;
import java.util.*;
public class Print_All_nos {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	String b="";
	while(a>0) {
		int c=a%10;
		b=c+" "+b;
		a/=10;
	}
	System.out.println(b);
}
}
