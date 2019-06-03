package clas;
import java.util.*;
public class Mod {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=a%30;
	if(b==1 || b==2) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
}
}
