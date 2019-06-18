package Try;
import java.util.*;
public class Count_Numeric_Characters {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	int count=0;
	for(int i=0;i<a.length();i++){
	if(a.charAt(i)>=48 && a.charAt(i)<=57){
		count++;
	}
	}
	System.out.println(count);
}
}
