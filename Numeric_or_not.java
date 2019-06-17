package clas;
import java.util.*;
public class Numeric_or_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	int count=0;
	for(int i=0;i<a.length();i++) {
		int b=a.charAt(i);
		if(b>=48&&b<=57||b==46) {
			count++;
		}
	}
	if(count==a.length()) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
}
}
