/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterpin;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class EnterPIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
                /*
                    a while loop is similar to a for loop because it checks a condition
                    befor it runs it's code block.
                    a while loop is differnt from a if statement because if continues to 
                    run it's code block as long as it's condition is true.
                    The isn't a int infront of entry in the while loop because its already been 
                    declared as a int variable on line 23 so it can be used globally by it's name 
                    and still be recongnized as a int
                    
                */
		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			//remove entry = keyboard.nextInt(); and it becomes a infinite loop
                        entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT. " + entry);
   
    
    }
    
}
