package Try;
import java.util.*;
public class String_greater_length {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b[]=a.split(" ");
		if(b[0].length()>b[1].length()){
			System.out.println(b[0]);
		}
		else{
			System.out.println(b[1]);
		}
}
}
