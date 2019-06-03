package clas;
import java.util.*;
public class CaeserCiphar {
	static String encrypt(String s) {
		String encrypt="";
		for(int i=0;i<s.length();i++) {
			char ch=(char)(s.charAt(i)+3);
			encrypt=encrypt+ch;
		}
		return encrypt;
	}
public static void main(String[]args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the string");
	String s= sc.next();
	System.out.println("Encrypted text is:"+CaeserCiphar.encrypt(s));
	System.out.println("Decrypted text is:"+s);
}
}