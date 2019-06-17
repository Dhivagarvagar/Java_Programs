package clas;
import java.util.*;
public class Space_count {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	int count=0;
	for(int i=0;i<a.length();i++) {
	if(a.charAt(i)==' ') {
		count++;
	}
	}
	System.out.println(count);
}
}
