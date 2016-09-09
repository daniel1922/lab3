import java.util.Scanner; //import scanner to view 

public class pair_display { //public class name

	public static void main(String[] args) { //main method
	
		Scanner input = new Scanner(System.in); //allows you to type input into scanner
		
		String number; //type of string we will be using
		String loop; //type of string we will be using

	//Welcome the user to the App	
		System.out.println("Learn your squares and cubes! \n"); //printing out the statement. The \n makes a new line
		
	//Ask the user for an integer
		System.out.println("Enter and interger: ");
		number = input.nextLine(); //string
		//changed the string to a number
		int x = Integer.parseInt(number); //
	
	//Loop through the integer from the user
		System.out.println("Number  " + "Squared  "  + "Cubed\n");
		for( int i = 0; i <= x ; i++){
			System.out.println( i + "       " + i*i + "         " +  i*i*i);

//			System.out.println(number);
			
			System.out.println("Continue(yes/no): ");
				loop = input.nextLine();
				while(loop.equalsIgnoreCase("yes"));{ 			
		}
		}
		}
	}
		
 	
		


