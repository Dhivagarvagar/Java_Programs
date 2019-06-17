package clas;
import java.util.*;
public class Hour_subtraction {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b=sc.nextLine();
	String c[]=a.split(" ");
	String f[]=b.split(" ");
	int d=Integer.parseInt(c[0]);
	int g=Integer.parseInt(f[0]);
	int e=1;
	int h=1;
	for(int i=0;i<c.length;i++) {
	  e= Integer.parseInt(c[i]);
	}
	for(int i=0;i<f.length;i++) {
		  h= Integer.parseInt(f[i]);
		}
	int result=d*60+e;
	int result1=g*60+h;
	result=result-result1;
	int hour=Math.abs(result/60);
	int minute=Math.abs(result%60);
	System.out.println(hour+" "+minute);
	}
}
