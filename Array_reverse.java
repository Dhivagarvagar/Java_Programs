package clas;
import java.util.*;
public class Array_reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	int b[]=new int[a.length];
	int j=0;
	for(int i=a.length-1;i>=0;i--) {
		b[j]=a[i];
		j++;
	}
	for(int i=0;i<b.length;i++)
	System.out.print(b[i]+" ");
}
}
