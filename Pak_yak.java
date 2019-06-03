package clas;
import java.util.*;
public class Pak_yak {
	public static void main(String [] args) {
	String a="Hi i am Dhivagar.I am doing my B.E in K.S.R college of Engineering,Thiruchengode.";
	String s1=a.concat(" "+"Vagar");
	System.out.println(s1);
	System.out.println(s1.charAt(6));
	System.out.println(s1.length());
	String d=s1.replace("am", "Am");
	System.out.println(d);
	System.out.println(s1.substring(4).trim());
	System.out.println(s1.substring(7,86).trim());
	System.out.println(s1.indexOf("i"));
	StringBuffer  p=new StringBuffer("Ezhil");
	p.reverse();
	System.out.println(p);
	System.out.println(p.reverse());
	p.replace(1, 3, "Karthi");
	System.out.println(p);
	}	
}
