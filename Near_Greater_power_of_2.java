package NewTry;
import java.util.*;
public class Near_Greater_power_of_2 {
public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	boolean b=false;
	for(int i=1;i<=a;i++) {
		int temp=(int)Math.pow(2, i);
		if(temp==a) {
			b=true;
			int res=(int)Math.pow(2, i+1);
			System.out.println(res);
			break;
		}
	}
}
}
