import java.util.*; 
import java.io.*; //read file
/**
 * Write a description of class StringTokenizer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activity10
{
    public static void main(String[]args) throws IOException
    {
        String sentence; 
        StringTokenizer stok; 
        
        Scanner input = new Scanner(System.in); 
        System.out.print("enter a sentence with space as delimiter: ");
        sentence = new String(input.nextLine());
        
        stok = new StringTokenizer(sentence); 
        while(stok.hasMoreTokens())
        {
            System.out.println("Tokens in the line "+ stok.countTokens());
            System.out.println(stok.nextToken()); 
        }
        stok = new StringTokenizer(sentence," ",true); 
        int total=0; 
        while(stok.hasMoreTokens())
        {
            total+=1;  
            stok.nextToken(); 
        }
        System.out.println("number of tokens including delimiters: "+total);
        
        System.out.println("enter a sentence with commas as delimiter: "); 
        String sentence1= new String(input.nextLine()); 
        stok= new StringTokenizer(sentence1,","); 
        while(stok.hasMoreTokens())
        {
            System.out.println("tokens in a line: "+ stok.countTokens()); 
            System.out.println(stok.nextToken()); 
        }
        stok = new StringTokenizer(sentence1,",",true); 
        total=0; 
        while(stok.hasMoreTokens())
        {
            total+=1;  
            stok.nextToken(); 
        }
        System.out.println("number of tokens including delimiters: "+total);
        System.out.println("enter a sentence with space and or commas as delimiter: "); 
        String sentence2=new String(input.nextLine()); 
        stok=new StringTokenizer(sentence2," ,"); 
        while(stok.hasMoreTokens())
        {
            System.out.println("tokens in a line: "+ stok.countTokens()); 
            System.out.println(stok.nextToken()); 
        }
        stok = new StringTokenizer(sentence2," ,",true); 
        total=0; 
        while(stok.hasMoreTokens())
        {
            total+=stok.countTokens(); 
            stok.nextToken(); 
        }
        System.out.println("number of tokens including delimiters: "+total); 
        
        //in = new Scanner(new File("datalines.txt")); 
        /**
         * while(in.hasNext())
         * {
         *      sentence = in.nextLine();
         *      stok = new StringTokenizer(sentence); 
         *      total += stok.countTokens(); 
        }
         */
    }
}
