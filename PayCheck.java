/**
 * Purpose: This class holds the data of the information entered by the user and will determine 
 *          a pay check for the user by using their input to calculate the user's gross pay, 
 *          federal tax amount, state tax amount, FICA amount, and net pay. 
 *
 * @author Audrey Jacobs 
 * @version 4 February 2018
 */
public class PayCheck
{
    //fields
    private double hourlyRate; //input by user
    private double hoursWorked; //input by user
    private double grossPay; //calculated by program based off of user input
    private double federalTaxAmount; //calculated by program based off of user input
    private double stateTaxAmount; //calculated by program based off of user input
    private double FICAAmount; //calculated by program based off of user input 
    private double netPay; //calculated by program based off of user input 
    private String lastName; //input by user
    private String firstName; //input by user
    private final double FEDERAL_TAX_RATE; //constant
    private final double STATE_TAX_RATE; //constant
    private final double FICA_RATE; //constant
    /**This no-args default constructor sets the values of the employee's
     * hourly rate, hours worked, gross pay, federal tax amount, state tax
     * amount, and FICA amount fields to zero; first name and last name
     * fields to null; and set the federal tax rate, state tax rate, FICA 
     * tax rate their base prices to 0.15, 0.09, and 0.07, respectively.  
     */
    public PayCheck()
    {
        //initalize all the numeric fields to zero and names to "unknown" 
        hourlyRate = 0.0; 
        hoursWorked = 0.0; 
        grossPay = 0.0; 
        federalTaxAmount = 0.0; 
        stateTaxAmount = 0.0; 
        FICAAmount = 0.0; 
        lastName = "Unknown"; 
        firstName = "Unknown"; 
        //constants 
        FEDERAL_TAX_RATE = 0.15; //base percent for federal tax rate
        STATE_TAX_RATE = 0.09; //base percent for state tax rate
        FICA_RATE = 0.07; //base percent for FICA rate 
    }
    /**This overloaded constructor allows the user to set the initial values of 
     * the fields
     * @param double inRate - a double representing the user's hourly rate
     * @param double inHours- a double representing the user's hours worked
     * @param double inPay- a double representing the user's gross pay 
     * @param double inFedTax- a double representing the user's federal tax amount
     * @param double inStateTax- a double representing the user's state tax amount
     * @param double inFICA- a double representing the user's FICA amount
     * @param double inLast- a double representing the user's last name 
     * @param double inFirst - a double representing the user's first name 
     * @param double inFedRate- a double representing the user's federal tax rate
     * @param double inStateRate- a double representing the user's state tax rate
     * @param double inFICARate- a double representing the user's FICA rate 
     */
    public PayCheck(double inRate, double inHours,double inPay, double inFedTax, double inStateTax, 
                    double inFICA, String inLast, String inFirst, double inFedRate, double inStateRate,
                    double inFICARate)
    {
        hourlyRate = inRate; 
        hoursWorked = inHours; 
        grossPay = inPay; 
        federalTaxAmount = inFedTax; 
        stateTaxAmount = inStateTax; 
        FICAAmount = inFICA; 
        lastName = inLast; 
        firstName = inFirst; 
        FEDERAL_TAX_RATE = inFedRate; 
        STATE_TAX_RATE = inStateRate;   
        FICA_RATE = inFICARate; 
    }
    /**This setLastName method allows the user to change the last name on the pay check 
     * @param String inLast - the user's last name 
     */
    public void setLastName(String inLast)
    {
        lastName = inLast; 
    }
    /**This setFirstName method allows the user to change the first name on the pay check
     * @param String inFirst - the user's first name
     */
    public void setFirstName(String inFirst)
    {
        firstName = inFirst; 
    }
    /**This setHourlyRate method allows the user to input their hourly rate. If it is within $5-100
     * then the hourly rate is set. The hourly rate also contributes the gross pay,which in
     * turn determines the federal tax amount, state tax amount, FICA amount, and net pay, all of
     * which are recalculated in this method. 
     * @param double inRate - user's hourly rate between 5 and 100 dollars
     */
    public void setHourlyRate(double inRate)
    {
        if (inRate >= 5 && inRate <= 100)//data validation 
        {
            hourlyRate = inRate;//user's input 
            if (hoursWorked <= 40)
            {   //calculates gross pay for if the user worked 40 hours or less
                grossPay = hourlyRate * hoursWorked;
            }else 
                {   //calculates gross pay for userover time 
                    grossPay = (40 * hourlyRate) + ( (hoursWorked - 40) * (1.5 * hourlyRate)) ;
                }
            //calculate tax and FICA deductions 
            federalTaxAmount = grossPay * FEDERAL_TAX_RATE;
            stateTaxAmount = grossPay * STATE_TAX_RATE;
            FICAAmount = grossPay * FICA_RATE; 
            //calculate net pay 
            netPay = grossPay - (federalTaxAmount + stateTaxAmount + FICAAmount); 
        }
    }
    /** This setHoursWorked method allows the user to input their hours worked. If it is within 0 and 80
     * then the hourly rate is set. The hours worked also contributes to the gross pay,which in
     * turn determines the federal tax amount, state tax amount, FICA amount, and net pay, all of
     * which are recalculated in this method. 
     * @param double inHours - the number of hours the user worked between 0 and 80
     */
    public void setHoursWorked(double inHours)
    {
        if(inHours >= 0 && inHours <= 80)//data validation
        {
            hoursWorked = inHours; //user's input
            if (hoursWorked <= 40)
            {   //calculates gross pay for if the user worked 40 hours or less
                grossPay = hourlyRate * hoursWorked;
            }else 
                {   //calculates gross pay for userover time 
                    grossPay = (40 * hourlyRate) + ( (hoursWorked - 40) * (1.5 * hourlyRate)) ;
                }
            //calculate tax and FICA deductions 
            federalTaxAmount = grossPay * FEDERAL_TAX_RATE;
            stateTaxAmount = grossPay * STATE_TAX_RATE;
            FICAAmount = grossPay * FICA_RATE; 
            //calculate net pay 
            netPay = grossPay - (federalTaxAmount + stateTaxAmount + FICAAmount); 
        }
    }
    /**This getLastName method returns the last name input by the user when called.
     * @return String - returns the last name of the user
     */
    public String getLastName()
    {
        return lastName; 
    }
    /**This getFirstName method returns the first name input by the user when called.
     * @return String - returns the first name of the user
     */
    public String getFirstName()
    {
        return firstName; 
    }
    /**This getHourlyRate method returns the user's hourly rate when called.
     * @return double - returns the user's rate per hour 
     */
    public double getHourlyRate()
    {
        return hourlyRate; 
    }
    /**This getHoursWorked method returns the user's hours worked when called. 
     * @return double - returns the hours worked by user
     */
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    /**This getGrossPay method returns the user's calculated gross pay when called.
     * @return double - returns the user's calculated gross pay 
     */
    public double getGrossPay()
    {
        return grossPay; 
    }
    /**This getFederalTaxAmount method returns the user's calculated federal tax amount when called. 
     * @return double - returns the user's calculated federal tax amount
     */
    public double getFederalTaxAmount()
    {
        return federalTaxAmount;
    }
    /**This getStateTaxAmount method returns the user's calculated state tax amount when called. 
     * @return double - returns the user's calculated state tax amount
     */
    public double getStateTaxAmount()
    {
        return stateTaxAmount; 
    }
    /**This getFICAAmount method returns the user's calculated FICA amount when called. 
     * @return double - returns the user's calculated FICA amount 
     */
    public double getFICAAmount()
    {
        return FICAAmount; 
    }
    /**This getNetPay method returns the user's calculated net pay when called. 
     * @return double - returns the user's calculated net pay
     */
    public double getNetPay()
    {
        return netPay; 
    }
    /**The toString method returns a method with a statement of the user's pay check information
     * when called. 
     *@return String - returns a message stating the user's last 
     *                  and first name, gross pay, federal tax amount, 
     *                  state tax amount, FICA amount, and net pay. 
     */
    public String toString()
    {
        return "Employee: "+lastName+" , "+firstName
        +"\n\tGross Pay: $"+grossPay
        +"\n\tFederal Tax Amount: $"+federalTaxAmount
        +"\n\tState Tax Amount: $"+stateTaxAmount
        +"\n\tFICA Amount: $"+FICAAmount
        +"\n\tNetPay: $"+netPay;
    }
}//end PayCheck class