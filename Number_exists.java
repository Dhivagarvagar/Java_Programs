package NewTry;
import java.util.*;
public class Number_exists {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int b=sc.nextInt();
	boolean c=false;
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for(int i=0;i<a.length;i++) {
		if(a[i]==b) {
			c=true;
			break;
		}
	}
	if(c) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
}
}
