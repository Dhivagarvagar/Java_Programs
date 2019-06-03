package clas;
import java.util.*;
public class Abc {
	public static boolean main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		a=a.toLowerCase();
		b=b.toLowerCase(); 
		boolean test1 = a.length() >= b.length()  && a.substring(a.length() - b.length()).equals(b);
		boolean test2 = b.length() >= a.length()  && b.substring(b.length() - a.length()).equals(a);
	    return test1==test2;

	}
}
