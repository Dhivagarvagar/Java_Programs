package clas;
import java.util.Scanner;
 
class AgeException extends Exception {
 
 public AgeException(String str) {
  System.out.println(str);
 }
}
public class AgeExcDemo {
 
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("Enter ur age :: ");
  int age = s.nextInt();
  
  try {
   if(age < 19) 
    throw new AgeException("Exception occured: InvalidAgeException: not valid");
   else
    System.out.println("Welcome to vote");
  }
  catch (AgeException a) {
   System.out.println(a);
  }
 }
}
