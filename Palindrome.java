package clas;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String a=sc.next();
	 String b="";
	 int n=a.length();
	 for(int i=n-1;i>=0;i--) {
		 b+=a.charAt(i);
	 }
	 System.out.println(a.equalsIgnoreCase(b) ? "Palindrome":"not Palindrome" );
	}
}
