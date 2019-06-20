package clas;
import java.util.*;
public class Average_of_n_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int result=0;
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		result+=a[i];
	}
	System.out.println((int)result/n);
}
}
