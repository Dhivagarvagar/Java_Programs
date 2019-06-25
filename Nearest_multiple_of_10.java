package NewTry;
import java.util.*;
public class Nearest_multiple_of_10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	for(int i=0;i<a%10;i++) {
		a=a+1;
		if(a%10==0) {
			System.out.println(a);
		}
	}
}
}
