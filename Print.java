package clas;
import java.util.*;
public class Print {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to print the pattern");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		double f=10.12345678901234567890;
		short b=129;
		System.out.println(f);
		int h=-10;
		System.out.println(~h);
		System.out.println(6 & 3);
		System.out.println(6 ^ 3);
		System.out.println(3 | 5);
		boolean k=true;
		k=!k;
		System.out.println(k);
		System.out.println(b == 128 & k);
		System.out.println(b == 129 ^ k);
		System.out.println(20+30 - -2 * (3 + 4)+2+3);
		int ret= f > b ? 1000 : 20 ;
		System.out.println(ret);
		for(int i=0,j=10;i<j;i++,j--) {
			System.out.println(i+" " +j);
		}
		System.out.println(" inner and outer");
		out: for(int i=0;i<5;i++) {
			in: for(int j=0;j<3;j++) {
				if(j == 2) {
					continue out;
				}		
				System.out.println("i ="+i+" j= "+j);
			}
		}
			int fact=1;
			int s=sc.nextInt();
			for(int i=1;i<=s;i++) {
				fact=fact*i;
			}
			if(fact<=120) {
			System.out.println(fact);
			}
			else {
				System.out.println("Not valid");
			}
	}
}
