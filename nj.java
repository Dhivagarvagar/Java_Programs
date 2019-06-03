package clas;
//A Class that represents use-defined expception 
import java.io.FileWriter;  
import java.io.*; 
public class nj
{ 
  public static void main(String[] args) throws Exception 
  { 
    // pass the path to the file as a parameter 
    FileReader fr = 
      new FileReader("E:\\testout.enc"); 
  String j="";
    int i; 
    while ((i=fr.read()) != -1) 
      j=j+((char) i); 
    FileWriter fw=new FileWriter("E:\\hai1.txt");
    fw.write(j);
    fw.close();
    System.out.println(j);
    
  } 
} 