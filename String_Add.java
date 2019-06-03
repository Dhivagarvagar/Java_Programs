package clas;
import java.util.*;
public class String_Add {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String A=sc.next();
	String B=sc.next();
	int c=A.length()+B.length();
	System.out.println(c);
	char [] d=A.toCharArray();
	char [] e=B.toCharArray();
	for(int i=0;i<d.length;i++) {
		char f=d[i];
		System.out.print(f);
	}
	System.out.println();
	for(int j=0;j<e.length;j++) {
		char k=e[j];
		System.out.print(k);
	}
	
}
}
