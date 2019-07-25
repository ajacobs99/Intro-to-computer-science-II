import java.util.*; 
/**
 * Write a description of class Driver here.
 *
 * @author Audrey Jacobs 
 * @version 1
 */
public class Driver
{
    public static void main(String[]args)
    {
        System.out.println("");
        char goAgain = 'y'; 
        Scanner input = new Scanner(System.in); 
        do 
        {
            Game play = new Game(); 
            do 
            {
                play.round(); 
                System.out.println(play.toString()); 
            }while(play.Winner() == false); 
            System.out.println(play.getWinner());
            
            System.out.println("would you like to go again? enter y for yes");
            goAgain = input.next().charAt(0); 
        }while (goAgain == 'y'); 
        System.out.println("goodbye");
    }
}
