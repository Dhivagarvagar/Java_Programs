package clas;
import java.util.*;
public class Array_elements_with_index_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" "+i);
	}
}
}