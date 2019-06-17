package clas;
import java.util.*;
public class Minute_to_hour {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=a;
	a=a/60;
	b=b%60;
	System.out.println(a+" "+b);
	}
}
