package NewTry;
import java.util.*;
public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	StringBuilder str=new StringBuilder(a);
	String c=str.reverse().toString();
	System.out.println(a.equals(c)? "yes": "no");	
}
}
