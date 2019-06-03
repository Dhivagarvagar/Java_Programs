package clas;
import java.util.*;
class Account{
	int no;
	String name;
	float amount;
	Account (int a,String n) {
		no=a;
		name=n;
	}
	 Account(int a,String n,float amt)
	{
		 no=a;
		name=n;
		amount=amt;
	}
	 void deposit(int amt) {
		 amount=amount+amt;
		 System.out.println(amount);
	 }
	void withdrawn(int amt) 
	{
		if(amount<amt)
		{
			System.out.println("Insufficient Balance");
			System.out.println("Because your Balance is:"+amount);
		}
		else {
			amount=amount-amt;
			System.out.println(amt+" Withdrawn");
			System.out.println("balance is:"+amount);
		}
		
	}
	void balance(){
		System.out.println("Balance is:"+amount);
	}
	void display() 
	{
		System.out.println(no+" "+name+" "+amount);
	}
	
}
public class Fact{
	public static void main(String [] args) 
	{
	Account ac=new Account(2, "vagar" );
	Account ac1=new Account(3, "Dhiva", 2000);
	ac.display();
	ac.deposit(30000);
	ac.balance();
	ac.withdrawn(10000);
	ac1.display();
	ac1.deposit(1000);
	ac1.balance();
	ac1.withdrawn(300000);
	}
}