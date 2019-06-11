package PRP;
import java.util.*;
public class Otp_Generation {
	public static String Add(String cat) {
		int sum=0;
		for(int i=0;i<cat.length();i++) {
			int temp=Integer.parseInt(cat.substring(i, i+1));
			sum+=temp;
		}
		return((sum>9)?Add(sum+""):sum+"");
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of the account holder");
	String name =sc.nextLine();
	System.out.println("Enter the account number");
	String number=sc.next();
	System.out.println("Type of the account");
	String type=sc.next();
	String output="";
	output=type.substring(0, 2);
	output+=number.substring(0,1);
	output+=Otp_Generation.Add(number.substring(0, 5));
	output+=name.substring(0, 1);
	output+=Otp_Generation.Add(number.substring(5, 10));
	output+=name.substring(name.length()-1, name.length());
	output+=number.substring(number.length()-1, number.length());
	System.out.println(output);
	
}
}
