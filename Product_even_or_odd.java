package NewTry;
import java.util.*;
public class Product_even_or_odd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int M=sc.nextInt();
	int res=N*M;
	if(res%2==0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
	}
}
