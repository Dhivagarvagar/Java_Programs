package Try;
import java.util.*;
public class Special_char_count {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b[]=a.split(" ");
	int count=0;
	for(int i=0;i<b.length;i++){
		String temp=b[i];
		for(int j=0;j<temp.length();j++){
			if(temp.substring(j,j+1).matches("[^a-zA-Z0-9]")){
				count++;
			}
		}
	}
	System.out.println(count);
}
}
