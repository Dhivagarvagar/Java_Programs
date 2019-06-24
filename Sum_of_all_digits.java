package clas;
import java.util.*;
public class Sum_of_all_digits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int sum=0;
	while(a>0) {
		int c=a%10;
		sum=sum+c;
		a=a/10;
	}
	System.out.println(sum);
}
}
