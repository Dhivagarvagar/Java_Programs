package clas;
import java.util.*;
public class Middle_element {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	int a[]=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	System.out.println(arr[n/2]);
}
}
