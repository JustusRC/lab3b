package lab3b;
import java.util.Scanner ;



public class cs123 {

	public static void main(String[] args) {
      
		//Variable declaration
		
		int age ;
      Scanner sam = new Scanner(System.in);
      
		// Prompt for user to enter age
        
       System.out.print("Enter your age: ");
       age=sam.nextInt();
       
       //if-else statement to print the desire result
		
		if (age >= 18)
		{
			System.out.print("You are eligible to vote");
		}
		else 
		{
	      System.out.print("You are not eligible to vote");
		}
		
		
		
		
	}

}
