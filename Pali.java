package clas;
import java.util.*;
public class Pali {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int sum=0;
	int c=a;
	while(a>0){
		int b=a%10;
		sum=sum*10+b;
		a/=10;
	}
	if(c==sum) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
}
}
