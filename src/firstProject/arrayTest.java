package firstProject;
import java.util.Scanner;

public class arrayTest {

	
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  int num[]= new int[3];
	  System.out.println("Enter Array elements");
	  
	  Scanner scan = new Scanner(System.in);
	  for(int i=0;i <num.length; i++)
	  {
	   num[i]= scan.nextInt();
	  }
	  System.out.println("Display before Sort");
	  System.out.println("********************************");
	  for(int i=0;i <num.length; i++)
	  {
	   System.out.println(num[i]);
	  }
	  System.out.println("********************************");
	  System.out.println("Display After Sort");
	  getSort(num);
	  scan.close();
	 }
	 
	 static void getSort(int []input)
	 {
	  int temp;
	  for(int i=0; i<input.length; i++)
	   for(int j=i; j<input.length; j++)
	   {
	    
	    if( input[i]< input[j])// Ascending / decemding
	    {
	     temp=input[i];
	     input[i]= input[j];
	     input[j]=temp;
	     
	    }
	   }
	  
	  System.out.println("*************************");
	  for(int i=0; i<input.length;i++)
	  {
	   
	   System.out.println(input[i]);
	  }
	  System.out.println("*************************");
	 }
	
}
