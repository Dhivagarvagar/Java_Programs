package clas;
import java.util.*;
public class Reverse {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	     for(int i=0; i<a;i++) {
			if(Math.pow(2, i)==a) {
				System.out.println("YES");
				break;
			}
			else {
				System.out.println("No");
			}
		}
	}	
}
