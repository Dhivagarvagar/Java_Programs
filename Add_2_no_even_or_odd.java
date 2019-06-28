package NewTry;
import java.util.*;
public class Add_2_no_even_or_odd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a+b;
	if(c%2==0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
}
}
