package clas;
import java.util.*;
	class Student {
		int id;
		String name;
		static int pincode=621010;
		
	
		 static void change() {
				pincode=621012;
		 }
	Student(int i,String n){
			id=i;
			name=n;
	}
		 
	Student(){
		
	}
	void display() {
		pincode++;
		System.out.println(id+" "+name+" "+pincode);
	}
	}
		 
public class Sum {
	public static void main(String [] args) {
		Student.change();
		 Student s1=new Student(1,"ram");
		 Student s2=new Student();
		 Student s3=new Student();
		 s2.id=s1.id;
		 s3.id=s2.id;
		 s2.name=s1.name;
		 s3.name=s2.name;
		s1.display();
		 s2.display();
		 s3.display();
	}
}
