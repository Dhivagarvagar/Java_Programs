package clas;
import java.util.*;
public class Odd_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int add=0;
	int i=1;
	while(i<n) {
		if(i%2==1) {
			System.out.print(i+" ");
		}
		add+=i;
		i++;
	}
}
}
