package firstProject;
import java.util.Scanner;

public class funcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // second commit
		  String s1,s2;
		  Scanner scan =new Scanner(System.in);
		  s1=scan.next();
		  s2=scan.next();
		  getConcat(s1,s2);
		  getConcatWW();
		  String ans1= getConcatWR();
		  String ans2= getConcatWRR(s1,s2);
		  System.out.println("****************************");
		  System.out.println("Ans1" + ans1);
		  
		  System.out.println("Ans1" + ans2);
		  System.out.println("****************************");
		  scan.close();
		 }
		 
		 static void getConcat(String a, String b)
		 {
		  System.out.println("Func without resturn type with parameter");
		 System.out.println(a+b); 
		 }
		 
		 static void getConcatWW()
		 {
		  System.out.println("Func without resturn type without parameter");
		 System.out.println("String"+"World"); 
		 }
		 
		 static String getConcatWR()
		 {
		  System.out.println("Func with resturn type without parameter");
		 return "String"+"World"; 
		 }
		 static String getConcatWRR(String x, String y)
		 {
		  System.out.println("Func with resturn type with parameter");
		 return x+y; 
		 }
		 
		


	}


