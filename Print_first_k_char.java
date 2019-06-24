package NewTry;
import java.util.*;
public class Print_first_k_char {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	int b=sc.nextInt();
	String c="";
		c=a.substring(0, b);
	System.out.println(c);
}
}
