import java.util.Scanner;

public class pair_display {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		String number;
		String loop;

	//Welcome the user to the App	
		System.out.println("Learn your squares and cubes! \n");
	
	do{ 	
	//Ask the user for an integer
		System.out.println("Enter and interger: ");
		number = input.nextLine();
		//changed the string to a number
		int x = Integer.parseInt(number);
		
	//Loop through the integer from the user
		System.out.println("Number  " + "Squared  "  + "Cubed\n" + "====    " + "====     "+ "====");
		for( int i = 0; i <= x ; i++){
			System.out.println( i + "       " + i*i + "         " +  i*i*i);

//			System.out.println(number);
			
			System.out.println("Continue(yes/no): ");
				loop = input.nextLine();
					
		}
		
		} 
	 	while(loop.equalsIgnoreCase("yes"));
		}

}
