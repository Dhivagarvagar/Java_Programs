package clas;
import java.util.*;
public class Array_sort_2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int [n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}	
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
}
}
