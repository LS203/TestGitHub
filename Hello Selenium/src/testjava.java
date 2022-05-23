import java.util.Scanner;

public class testjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberoflimbs=4;
		Scanner input = new Scanner(System.in);//to enter input from console
        System.out.println("enter no of limbs");
        numberoflimbs=input.nextInt();
		if(numberoflimbs==4) {
			
			System.out.println("animal is dog");
		}
		else if(numberoflimbs==6) {
			System.out.println("cow");
		}
		
		else {
			System.out.println("cat");
		}
		
		
	}
}
