package NewTry;
import java.util.*;
public class Check_binary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	boolean b=true;
	for(int i=0;i<a.length();i++) {
	if(a.charAt(i)!=48 && a.charAt(i)!=49) {
		b=false;
		break;
	}
	}
	if(b) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
	
}
}
