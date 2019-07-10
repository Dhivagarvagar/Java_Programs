package NewTry;
import java.util.*;
public class Changing_Middle_element {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String b="";
	int c=a.length()/2;
	int d=c+1;
	if(a.length()%2==1) {
		b=a.substring(0,c)+"*"+a.substring(d,a.length());
		System.out.println(b);
	}
	else {
		b=b=a.substring(0,c-1)+"**"+a.substring(d,a.length());
		System.out.println(b);
	}
}
}
