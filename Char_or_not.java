package clas;
import java.util.*;
public class Char_or_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	int j=0;
	for(int i=0;i<a.length();i++) {
		int b=(char)a.charAt(i);	
			if(b>=65 && b<=90 || b>=97 && b<=122) {
				j++;
			}
	}
	if(j==a.length()) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
}
}
