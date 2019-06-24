package NewTry;
import java.util.*;
public class Alphabet_numbers_present {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	boolean b=false;
	boolean c=false;
	for(int i=0;i<a.length();i++) {
		if(c && b) {
			break;
			}
		if(a.charAt(i)>=48 && a.charAt(i)<=57 ) {
			b=true;
		}
		if(a.charAt(i)>=65 && a.charAt(i)<=90 || a.charAt(i)>=97 && a.charAt(i)<=122){
			c=true;
		}
			}
	if(b && c) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
}
}
