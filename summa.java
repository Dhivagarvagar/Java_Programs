package clas;
import java.util.*;
public class summa {
				public static void main(String [] args) {
				 int a=0;
				 int b=0;
				 int c=1;
				 
				 Scanner sc=new Scanner(System.in);
				 int n=sc.nextInt();
				 for(int i=1;i<=99;i++) {
					 a=b;
					 b=c;
					 c=a+b;
					 System.out.print(a+ " ");
					 }
				}
}