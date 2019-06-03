package clas;
import java.util.*;
public class Sorted_char {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	int ch=0;
	int temp;
	for(int i=0;i<a.length();i++) {
	 ch=(int)a.charAt(i);
	 for(int j=0;j<a.length();j++) {
		 for(int k=j+1;i<a.length();j++) {
			 if(j<k) {
				 temp=i;
				 i=j;
				 j=temp;
			 }
		 }
	 }
	 for(int h=0;i<a.length();i++) 
	 System.out.println(ch);
	}
}
}

