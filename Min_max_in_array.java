package Try;
import java.util.*;
public class Min_max_in_array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	System.out.println(a[0]+" "+a[a.length-1]);
}
}
