package clas;
import java.util.*;
public class EncodedArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b[]=a.split(" ");
	int sum=0;
	int c[]=new int[b.length];
	int encode[]=new int[b.length];
	for(int i=0;i<b.length;i++) {
		c[i]=Integer.parseInt(b[i]);
		sum=sum+c[i];
	}
	for(int i=0;i<b.length-1;i++) encode[i]=c[i+1]-c[i];
		encode[b.length-1]=c[b.length-1];
	
	for(int i=0;i<b.length;i++) 
	System.out.print(encode[i]+" ");
	System.out.print("\n"+c[0]+"\n"+sum);
	}
}
