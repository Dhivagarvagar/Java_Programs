package NewTry;
import java.util.*;
public class No_of_repetations {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int b=sc.nextInt();
	int count=0;
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for(int i=0;i<a.length;i++) {
		if(a[i]==b) {
			count++;
		}	
	}
	System.out.println(count);
}
}
