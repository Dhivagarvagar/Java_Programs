package clas;
import java.util.*;
public class Array_sum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int h=sc.nextInt();
	int a[]=new int[n];
	int sum=0;
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	System.out.print(a[i]+" ");
		
	for(int i=0;i<h;i++) {
		sum+=a[i];
	}
	System.out.println();
System.out.println(sum);
}
}
