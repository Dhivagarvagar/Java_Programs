package clas;
import java.util.*;
public class Sorted_or_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a>=b && b>=c || a<=b && b<=c) {
		System.out.println("Sorted");
	}
	else {
		System.out.println("Not Sorted");
	}
}
}
