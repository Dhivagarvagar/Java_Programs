package clas;
import java.util.*;
public class Multiples {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=a;
	for(int i=1;i<=5;i++) {
		a=b;
		a*=i;
		System.out.print(a+" ");
	}
}
}
