package clas;
import java.util.*;
public class PrintAdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println(a+"+"+b+"="+(a+b));
	for(int i=111;i>=2;i--) {
		System.out.print(i+" ");
	}
	int h=sc.nextInt();
	int w=sc.nextInt();
	int r=h-w;
	for(int i=1;i<=10;i++) {
		System.out.print(Math.abs(i*r)+" ");
	}
	int d=sc.nextInt();
	switch(d) {
	case 1:
		System.out.println("One");
		break;
	case 2:
		System.out.println("Two");
		break;
	case 3:
		System.out.println("Three");
		break;
	case 4:
		System.out.println("Four");
		break;
	case 5:
		System.out.println("Five");
		default :
			System.out.println("default");
	}
	int i=1;
	do {
		System.out.print(i+"-");
		i++;
	}while(i<=99);
	System.out.println("100");
	int l=sc.nextInt();
	double m=l*0.8;
	System.out.printf("%.2f",m);
	int x=sc.nextInt();
	int y=sc.nextInt();
	if(x%2==0 && y%2==0) {
		System.out.println("EVEN");
	}
	else if(x%2==1 && y%2==1) {
		System.out.println("ODD");
	}
	else {
		System.out.println("Mixed");
	}
	int p=sc.nextInt();
	int q=sc.nextInt();
	int t=sc.nextInt();
	if(p+q==t || p+t==q || q+t==p ) {
		System.out.println("Yes");
	}
	else {
		System.out.println("NO");
	}
}
}
