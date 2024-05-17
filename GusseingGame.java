import java.util.Random;
import java.util.Scanner;

public class GusseingGame {

	public static void main(String[] args) {
		
		Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        
        int randomnumber=rand.nextInt(100) +1;
       // System.out.println("Random number is :" +randomnumber);
        
        int trycount = 0;
        while(true) {
        	 
            System.out.println("Enter your guess Number (1-100)");
            int playerGuess = sc.nextInt();
            trycount++;
            
            if(playerGuess == randomnumber) {
            	System.out.println("Correct You Win!");
            	System.out.println("You may Took " + trycount + " chance ");
            	break;
            } else if(randomnumber > playerGuess) {
            	System.out.println("Nope! The number is higher! Guess again "); 	
            }
            else {
            	System.out.println("Nope! The number is lower! Guess again");
            }
        }
        sc.close();
	}	
}