/**
 * Purpose : The driver class contains the main() method to calculate a pay check and display the  
 *           employee details and net pay entered by the user on the screen. After the user enters 
 *           their initial information, the program prompts them if they want to change information
 *           in a do-while loop; if yes the program gives them a menu choice to select what they 
 *           wish to change, if no the program ends. 
 *
 * @author Audrey Jacobs
 * @version 8 February 2018
 */
import java.util.*; 
public class Driver
{//start driver class
    public static void main(String[]args)
    {//start main method
        //local variables 
        String lastName; //input by user 
        String firstName; //input by user
        double hoursWorked;//input by user 
        double hourlyRate; //input by user
        double grossPay; //calculated by program
        char goAgain = 'y'; //initalized to 'y'
        char choice; //input by user
        
        Scanner input = new Scanner(System.in); //calling scanner class object 

        PayCheck myPayCheck; //reference variable of PayCheck Object
        myPayCheck = new PayCheck(); //creation of new PayCheck Object 

        System.out.println("Employee Last Name: ");//prompt user to input last name 
        lastName = input.next(); //user inputs last name 

        System.out.println("Employee First Name: ");//prompts user to input first name 
        firstName = input.next(); //user inputs first name

        System.out.println("Hours Worked: ");//prompts user to input number of hours worked
        hoursWorked = input.nextDouble(); //user inputs number of hours worked

        System.out.println("Hourly Rate: ");//prompts user to input their hourly rate
        hourlyRate = input.nextDouble(); //user inputs their hourly rate
        
        //calculations for myPayCheck object
        myPayCheck.setLastName(lastName); //setLastName method is called 
        myPayCheck.setFirstName(firstName); //setFirstname method is called 
        myPayCheck.setHoursWorked(hoursWorked); //setHoursWorked method is called
        myPayCheck.setHourlyRate(hourlyRate); //setHourlyRate method is called 
        //toString method is called to print user's information 
        System.out.println(myPayCheck.toString()); 
        
        //For efficency the do while loop is only for if the user wants to change information 
            //and stops when the user says so.
        do 
        {   //start do while loop 
            System.out.println("Would you like change any information?"
                +"\n\t enter 'y' for yes and 'n' for no");//user prompted to go again 
            goAgain = input.next().charAt(0); //user inputs choice 

            if (goAgain == 'y'|| goAgain == 'Y') 
            {   //start if statement
                //user is prompted with menu options 
                System.out.println("Menu Options:"
                    +"\n   P = Pay Check (Print)"
                    +"\n   F = First name (Change) "
                    +"\n   L = Last name (Change)"
                    +"\n   W = Hours Worked (Change)"
                    +"\n   R = Hourly Rate (Change)");
                choice = input.next().charAt(0); //user enters their choice 

                switch(choice)
                {//start switch statement
                    //case for first name option 
                    case 'F':   
                    case 'f': System.out.println("Change Employee's First Name: "); //user prompted to input first name 
                    firstName = input.next();//user enters first name 
                    myPayCheck.setFirstName(firstName);//setFirstname Method is called to change first name 
                    //updated paycheck infomration is printed 
                    System.out.println("UPDATE: "); 
                    System.out.println(myPayCheck.toString()); //toString method is called 
                    ;break; 
                    //case for last name option 
                    case 'L': 
                    case 'l': System.out.println("Change Employee's Last Name: ");//user prompted to input last name 
                    lastName = input.next(); //user enters last name 
                    myPayCheck.setLastName(lastName);//setLastname method is called to change last name 
                    //updated paycheck information is printed 
                    System.out.println("UPDATE: "); 
                    System.out.println(myPayCheck.toString());//toString method is called 
                    ;break; 
                    //case for hours worked option 
                    case 'W': 
                    case 'w': System.out.println("Change Hours Worked: ");//user prompted to input hours worked 
                    hoursWorked = input.nextDouble(); //user enters hours worked 
                    myPayCheck.setHoursWorked(hoursWorked); //setHoursWorked method is called to change hours worked 
                    //updated paycheck information is printed 
                    System.out.println("UPDATE: "); 
                    System.out.println(myPayCheck.toString());//toString method is called 
                    ;break; 
                    //case for hourly rate option 
                    case 'R': 
                    case 'r': System.out.println("Change Hourly Rate: ");//user prompted to input hourly rate 
                    hourlyRate = input.nextDouble();//user enters hourly rate 
                    myPayCheck.setHourlyRate(hourlyRate);//setHourlyRate is called to change the hourly rate 
                    //updated paycheck information is printed 
                    System.out.println("UPDATE: "); 
                    System.out.println(myPayCheck.toString());//toString method is called 
                    ;break; 
                    //case for print pay check option 
                    case 'P': 
                    case 'p': System.out.println(myPayCheck.toString()); //toString method is called 
                    ;break; 
                }//end switch statement
            }//end if statment 
        }while(goAgain == 'y'); //end do while loop 
        System.out.println("Goodbye!"); //closing statement 
    }//end of main method
}//end of driver class
