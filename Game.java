
/**
 * Write a description of class Game here.
 *
 * @author Audrey Jacobs 
 * @version 1
 */
public class Game
{
    private Die [] player;  
    private Die [] computer; 
    private int [] scores; 
    private final int MAX_SCORE; 
    
    public Game()
    {
        player = new Die [6]; 
        computer = new Die [6];
        scores = new int [2];
        MAX_SCORE = 100; 
        for (int k = 0; k < player.length; k++)
        {
            player[k] = new Die(); 
            computer[k] = new Die(); 
        }
    }
    
    private void roll()
    {
        for (int k = 0; k < player.length; k++)
        {
            player[k].roll(); 
            computer[k].roll(); 
        }
    }
    
    private void sort()
    {
        for(int k = 0; k < player.length - 1 ; k++)
        {
            for (int j = 0; j < player.length - k -1; j++)
            {
                if (player[j].getFace() > player[j+1].getFace())
                {
                    Die temp = player[j]; 
                    player[j] = player [j+1]; 
                    player[j+1] = temp; 
                }
                if (computer[j].getFace() > computer[j+1].getFace())
                {
                    Die temp = computer[j]; 
                    computer[j] = computer [j+1]; 
                    computer[j+1] = temp; 
                }
            }
        }
    }
    
    private int getScore(Die [] d,int index)
    {
        int points = 0; 
        
        if(d[0].getFace() == 1)
        {
            points = 5; 
            if (d[1].getFace() == 2)
            {
                points+=5; 
                if (d[2].getFace() == 3)
                {   
                    points+=5; 
                    if (d[3].getFace() == 4)
                    {
                        points+=5; 
                        if (d[4].getFace() == 5)
                        {
                            points+=5; 
                            if (d[5].getFace() == 6)
                            {
                                points+=10; 
                            }
                        }
                    }
                }
            }
        }
        if(d[0].getFace() == 1&& d[1].getFace() == 1&& d[2].getFace() == 1)
        {
            points = - 1 * scores[index]; 
        }
        return points; 
    }
    
    public void round()
    {
        roll(); 
        sort(); 
        scores[0] += getScore(player, 0); 
        scores[1]+= getScore(computer, 1); 
    }
    
    public boolean Winner()
    {
        if (scores[0] < MAX_SCORE && scores[1] < MAX_SCORE)
        {
            return false; 
        }else 
            return true; 
    }
    
    public String getWinner()
    {
        if (scores[0] == MAX_SCORE)
            return "Player won!!"; 
        if (scores[1] == MAX_SCORE)    
            return "Computer won!!"; 
        else
            return ""; 
    }
    public String toString()
    {
        StringBuilder str = new StringBuilder(); 
        
        str.append("\nPlayer: "); 
        for (int a = 0 ; a < player.length ; a++)
        {
            str.append(player[a].toString()); 
        }
        str.append("\nPlayer Score: "+scores[0]); 
        
        str.append("\nComputer: "); 
        for(int b = 0 ; b < computer.length; b++)
        {
            str.append(computer[b].toString()); 
        }
        str.append("\nComputer Score: "+scores[1]); 
        
        return new String(str); 
    }
}
