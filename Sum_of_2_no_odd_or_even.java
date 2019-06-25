package NewTry;
import java.util.*;
public class Sum_of_2_no_odd_or_even {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a+b;
	if(c==0) {
		System.out.println("even");
	}
	else if(c%2==0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
}
}
