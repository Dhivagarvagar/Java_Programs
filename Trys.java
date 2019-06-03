package clas;
import java.util.*;
public class Trys {
public static void main(String [] args) {
	int n;
	int t1=0;
	int t2=1;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
      while(t1<=n) {
    	  System.out.print(t1+ " ");
      int sum=t1+t2;
      t1=t2;
      t2=sum;
      }
}
}
