
/**
 * The Player class represents a player in the Tic-Tac-Toe game and assign
 * them a symbol. Each player has a symbol of either "X" or "X" that 
 * they will use to mark their move on the board during the game 
 *
 * @author Eddie 
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables
    private String symbol; 
    
    /**
     * Constructor for objects of the player Class 
     * 
     * @param symbol is the symbol that the player will use (X or O)
     */
    
    public Player(String symbolParam)
    {
        symbol = symbolParam; 
    }
    
    /**
     * Accessor method for the symbol instance variable (X or Y) 
     * 
     * @return symbol is the X or Y used by the object 
     */
    
    public String getSymbol()
    {
        return symbol; 
    }
    
    /**
     * Accessor method to get the player's move based on the current board 
     * 
     * @param b is the current game board 
     * @return is the position where the player wants to move
     */
    public int getMove(Board b)
    {
        //TODO 
        return 0; 
    }
}
