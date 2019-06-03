package clas;
import java.util.*;
public class No_of_digits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int count=0;
	for(;a>0;) {
		a/=10;
		count+=1;
	}
	System.out.println(count);
}
}
