package Try;
import java.util.*;
public class Count_num_in_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int count=0;
	while(a>0){
		count++;
		a/=10;
	}
	System.out.println(count);
}
}
