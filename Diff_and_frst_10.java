package clas;
import java.util.*;
public class Diff_and_frst_10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=Math.abs(a-b);
	for(int i=1;i<=10;i++) System.out.print(i*c+" ");
}
}
