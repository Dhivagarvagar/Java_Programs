package Try;
import java.util.*;
public class String_concat {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b[]=a.split(" ");
	for(int i=0;i<b.length;i++){
		System.out.print(b[i]);
	}
}
}