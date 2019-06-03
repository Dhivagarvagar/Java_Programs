package clas;
import java.util.*;
public class String_even_Max {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in) ;
	int max=0;
	String b="";
	int min=0;
	String s1=sc.nextLine();
	String s2[]=s1.split(" ");
	for(int i=0;i<s2.length;i++) {
		if(s2[i].length()%2==0) {
			if(max<s2[i].length()) {
			 max=s2.length;
			 min=i;
			}
			
	}
	}
	if(min==0) {
		System.out.println("0000");
	}
	else System.out.println(s2[min]);
}
}
