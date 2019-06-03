package clas;
import java.util.*;
public class Hi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				int count2=0;
		String str=sc.nextLine();
		int count1=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='i') {
				count1++;
			}
		}
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)==' ') {
				count2++;
			}
		}
		if(count1==count2) {
			System.out.println("String values are Equal");
		}
		else {
			System.out.println("String values are not Equal");
		}
	}
}
