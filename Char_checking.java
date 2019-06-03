package clas;
import java.util.*;
class Check {
	char ch1,ch2,ch3;
	String cheking(char ch11,char ch12,char ch13) {
		ch1=ch11;
		ch2=ch12;
		ch3=ch13;
		if(ch1!=ch3 && (ch1==ch2 ||ch2==ch3)) {
			return ("Same");
		}
		else {
			return ("Different");
		}
	}
	}

public class Char_checking {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Check c=new Check();
	char a=sc.next().charAt(0);
	char b=sc.next().charAt(0);
	char d=sc.next().charAt(0);
	String h=c.cheking(a, b, d);
	System.out.println(h);
}
}
