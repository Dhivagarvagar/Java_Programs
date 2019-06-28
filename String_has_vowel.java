package NewTry;
import java.util.*;
public class String_has_vowel {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	int count=0;
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)=='a'||a.charAt(i)=='A'||a.charAt(i)=='e'||a.charAt(i)=='E'||a.charAt(i)=='i'||a.charAt(i)=='I'||a.charAt(i)=='o'||a.charAt(i)=='O'||a.charAt(i)=='u'||a.charAt(i)=='U') {
			count++;
			break;
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
