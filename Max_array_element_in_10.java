package Try;
import java.util.*;
public class Max_array_element_in_10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int max=0;
	for(int i=0;i<10;i++){
		int a=sc.nextInt();
		if(a>=max){
			max=a;
		}
	}
	System.out.println(max);
}
}
