package clas;
import java.util.*;
public class Print_string_no_time {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	for(int i=0;i<a.length();i++) {
		for(int j=0;j<i+1;j++) {
			System.out.print(a.charAt(i));
		}
	}
}
}
