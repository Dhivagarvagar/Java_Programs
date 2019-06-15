package clas;
import java.util.*;
public class Arithmetic_progression {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    float n=sc.nextFloat();
	float	a=sc.nextFloat();
	float d=sc.nextFloat();
    float w=n/2;
    float q= ((2*a) + (n-1)*d);
	float S = w*q;
	System.out.println((int)S);
	
}
}
