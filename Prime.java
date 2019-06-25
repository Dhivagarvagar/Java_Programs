package NewTry;
import java.util.*;
public class Prime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);		
	int a=sc.nextInt();
	boolean b=false;
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			b=true;
			break;
		}
	}
	if(!b) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
	}
}
