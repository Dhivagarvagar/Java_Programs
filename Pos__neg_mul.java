package clas;
import java.util.*;
public class Pos__neg_mul {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=a;
	a%=10;
	if(b>0) {
		for(int i=1;i<=5;i++) {
			System.out.print(i*a+" ");
		}
	}
	else {
		for(int i=1;i<=10;i++) {
			System.out.print(Math.abs(i*a)+" ");
		}
		
	}
}
}
