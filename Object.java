package clas;
import java.util.*;
class Dhiva{
	int rollNo;
	String name;
	int contactNo;
	
	void get(int r,String n) {
		rollNo=r;
		name=n;
		}
	void set() {
		System.out.print(" "+rollNo +" "+name +" ");
	}
	
	}
public class Object {
	public static void main(String[] args) {
	Dhiva d=new Dhiva();
	Dhiva d1=new Dhiva();
	Dhiva d2=new Dhiva();
	d.contactNo=723156654;
	d.get(1,"Dhivagar");
	d.set();
	System.out.println(" "+d.contactNo);
	d1.get(2, "Vagar");
	d1.set();
	d1.contactNo=850886825;
	System.out.println(d1.contactNo);
	d2.get(3,"CCCCC");
	d2.set();
	d2.contactNo=5555555;
	System.out.println(d2.contactNo);
	}
}
