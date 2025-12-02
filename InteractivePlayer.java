import java.util.Scanner; 

/**
 * The InteractivePlayer class will represent a human player in the game.
 * It extends the Player class and will allow a human to input their moves 
 * 
 * @author Eddie
 * @version (add later) 
 */
public class InteractivePlayer extends Player
{
    // instance variables
    private Scanner scan; 
    //Symbol will be inhereted from the player class 

    /**
     * Constructor for objects of class InteractivePlayer
     * 
     * @param s is the sytmbol the player will use (either X or O) 
     */
    public InteractivePlayer(String s)
    {
        super(s); 
        
        scan = new Scanner(System.in); //initialize the scanner 
    }
    

    /**
     * Constructor for objects of class InteractivePlayer with the provided Scanner. 
     *
     * @param  s the symbol this player will use ("X" or "O") 
     * @param sc the Scanner object to use for input 
     */
    public InteractivePlayer(String s, Scanner sc)
    {
        // put your code here
        super(s); //calls the parent class
        
        scan = sc; //initializes to the scanner to the provided Scanner 
    }
    
    /**
     * Accessor method for the scan instance variable 
     * 
     * @return the Scanner object used for input 
     */
    public Scanner getScan()
    {
        return scan; 
    }
    //note: getSymbol is inherited from the player class 
}
