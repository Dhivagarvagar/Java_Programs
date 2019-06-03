package clas;
import java.util.*;
public class Char_inc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char Ch=sc.next().charAt(0);
		for(int i=(int)Ch;i<(int)Ch+6;i++ ){
		    System.out.print((char)i);
	}
}
}