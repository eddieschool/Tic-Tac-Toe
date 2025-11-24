
/**
 * The Board class represents the classic Tic-Tac-Toe game board that is a 3x3 grid
 * It uses a 2D array to manage the game and provides methods to interact with the board 
 *
 * @author Eddie 
 * @version (a version number or a date)
 */
public class Board
{
    //instance variables 
    private String[][] board; 
    private static final int SIZE = 3; 
    
    /**
     * Constructor for objects of the Board class 
     * Initializes the board to a 2D array with SIZE(3) rows and SIZE(3) columns (3x3 grid) 
     */
    
    public Board()
    {
        board = new String[SIZE][SIZE]; 
    }
    
    /**
     * Accessor method for the board instance variable 
     * @return the 2D array that represents the board 
     */
    
    public String[][] getBoard()
    {
        return board; 
    }
    
    /**
     * Accessor method for the SIZE constant 
     * 
     * @return the size of the board (# x #) (so in our case (3x3) 
     */
    
    public int getSize()
    {
        return SIZE; 
    }
    
    /**
     * method to make a move on the board at the position specified 
     * 
     * @param move is the position to place the symbol 
     * @param symbol is the symbol to place in said spot (X or O) 
     */
    
    public void makeMove(int move, String symbol) 
    {
        //convert move (1-9/numSpaces) to row and column 
        //move 1 = row 0, col 0 
        //move 2 = row 0, col 1
        //move 3 = row 0, col 2 
        //move 4 = row 1, col 0
        //move 5 = row 1, col 1, etc 
        
        int row = (move - 1 ) / SIZE; 
        int col = (move - 1) % SIZE; 
        
        //place the symbol at the position 
        board[row][col] = symbol; 
    }
    
    /** 
     * Determines if there is a winner 
     * 
     * @return the symbol of the winner or null if no one wins 
     */
    
    public String determineWinner()
    {
        //TODO 
        return null; //likely if it's a tie? we'll find out I guess 
    }
    
    /**
     * Check to see if the board is completely full 
     * 
     * @return true if the board is full and false otherwise 
     */
    public boolean isBoardFull()
    {
        //loop through the boards positions
        for (int row = 0; row < SIZE; row++)
        {
            for (int col = 0; col < SIZE; col++)
            {
                if(board[row][col] == null)//checking each space to see if there is a null (empty) spot. Returns false if/when hit
                {
                    return false; 
                }
            }
        }
        return true; //if all other positions were checked with none being null/empty 
    }
    
}
