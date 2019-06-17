package clas;
import java.util.*;
public class Words_count_without_space {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b[]=a.split(" ");
	int count=0;
	for(int i=0;i<b.length;i++) {
		count+=b[i].length();
	}
	System.out.println(count);
}
}
