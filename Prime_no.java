package clas;
import java.util.*;
public class Prime_no {
public static void main(String[] args) {
	int input=10;
	int in=0;
	for(int i=2;i<=10000;i++) {
		int count=0;
		for(int j=2;j<=10000;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==1) {
			in++;
			if(in==input) {
				System.out.println(i);
			}
			}
	}
}
}
