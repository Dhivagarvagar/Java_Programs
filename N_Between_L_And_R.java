package NewTry;
import java.util.*;
public class N_Between_L_And_R {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int L=sc.nextInt();
	int R=sc.nextInt();
	int count=0;
	for(int i=L+1;i<R;i++) {
		if(N==i) {
			count++;
		}
	}
	if(count==1) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
}
}