package clas;
import java.util.*;
public class Coding_bat {
	public static void main(String [] args) {
		String q="";
		String a="dhiva";
		String b="";
		q+=(a.length()>1)?a.charAt(0):'@';
		q+=(b.length()>1)?b.charAt(b.length()-1):'@';
		System.out.println(q);
	}
}
