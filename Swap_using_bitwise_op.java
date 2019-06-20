package Try;
import java.util.*;
public class Swap_using_bitwise_op {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println(a+" "+b);
}
}
