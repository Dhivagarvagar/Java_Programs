package clas;
import java.util.*;
public class Prime_limits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	for(int i=a+1;i<b;i++) {
		boolean c=true;
		for(int j=2;j<i;j++) {
			if(i%j==0){
				c=false;
				break;
			}
		}
		if(c) {
			System.out.print(i+" ");
		}
	}
}
}
