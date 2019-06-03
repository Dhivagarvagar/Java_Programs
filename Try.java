package clas;
import java.util.*;
/*class Hi{
	int no;
	String name;
	int contact;
	Hi(int no,String name,int contact) {
		this.no=no;
		this.name=name;
		this.contact=contact;
	}
	void dei() {
		System.out.println("hi");
	}
	void display(){
		System.out.println(name+" "+no+" "+contact);
		this.dei();
	}
	Hi(){
		System.out.println("hi");
	}
	Hi(int x){
		this();
		System.out.println(x*x);
	}
	
	}*/

public class Try {
	public static void main(String [] args) {
			/*Hi h=new Hi(1,"Dhiva",709233);
			h.display();
		Hi h1=new Hi(2);*/
		Scanner sc=new Scanner(System.in);
		int year = sc.nextInt();
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println("yes");
        else
            System.out.println("No");
	
		
		}
	}

