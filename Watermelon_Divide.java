package PRP;
import java.util.*;
public class Watermelon_Divide {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a<100) {
		int b=a%2;
		int c=a/2;
	if(b==0&&c%2==0) {
		System.out.println("yes");
		System.out.println(c+""+c);
	}
	else if(c%2==1){
		System.out.println("yes");
		int c1=c-1;
		int c2=c+1;
		System.out.println(c1+""+c2);
	}
	else {
		System.out.println("No");	
	}
	}
	else {
		System.out.println("Invalid input");
	}
}
}
