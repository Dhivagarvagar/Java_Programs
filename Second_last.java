package clas;
import java.util.*;
public class Second_last {
	public static void main(String [] args) {
		int a=12345;
		String b=Integer.toString(a);
		if(b.length()>2) {
		int c=a%10;
		int d=a/10;
		int e=d%10;
		System.out.println(Math.abs(e));
		}
		else if(b.length()<2) {
			System.out.println("-1");
		}
	}
}
