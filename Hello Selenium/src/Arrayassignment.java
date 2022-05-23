import java.util.Scanner;

public class Arrayassignment {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int []myarray =new int[10];
		Boolean check=false;
       for(int i=0;i<myarray.length;i++)
       { 
    	   System.out.println("enter the number"+"\n");
    	   myarray[i]=scanner.nextInt();
       }
       
      System.out.println("\n"+"enter number to check");
      int number=scanner.nextInt();
      for(int j:myarray) {
    	  if(j==number)
    		  check=true;
      }
  System.out.println(check);
       
	}
}

	

