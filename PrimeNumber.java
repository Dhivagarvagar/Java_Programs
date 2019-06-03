package clas;
import java.util.*;
public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	boolean b=true;
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			b=false;
			break;
		}
	}
	if(!b)
	System.out.println("no");
	else
	System.out.println("yes");
}
}
