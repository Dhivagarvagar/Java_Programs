package clas;
import java.util.*;
public class Odd_Count {
	static int num(int a[]) {
		int count=0;
		for(int i=0;i<a.length;i++) {
		if(a[i]%2==1) {
			count+=1;
		}
		}
		return count;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	int h=Odd_Count.num(a);
	System.out.println(h);
}
}
