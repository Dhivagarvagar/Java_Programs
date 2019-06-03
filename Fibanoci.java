package clas;
import java.util.*;
public class Fibanoci {
public static void main(String[] args) {
	Scanner a =new Scanner(System.in);
	int len=a.nextInt();
	int a1=0,a2=1,a3;
	System.out.print(a1+" "+a2+" ");
	for(int i=2;i<len;i++) {
		a3=a1+a2;
		System.out.print(a3+" ");
		a1=a2;
		a2=a3;
	}
	String s="abc";
	s=s+s;
	System.out.println(s);
}
}