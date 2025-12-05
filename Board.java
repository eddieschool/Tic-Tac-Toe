
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
     * Checks is a specific spot on the board is taken 
     * 
     * @param is the move/position to check 
     * @return true if the spot is taken (not null) and false if else 
     */
    
    private boolean isSpotTaken(int move)
    {
        //convert nove to a row and column 
        int row = (move - 1) / SIZE; 
        int col = (move - 1) % SIZE; 
        
        //check if the spot on the board is taken or null 
        if (board[row][col] != null)
        {
            return true; 
        }
        else //is null
        {
            return false; 
        }
    }
    
    /**
     * Check to see if a move is valid. It is valid if it is between 1 and numSpaces
     * The spot also cannot be taken already 
     * 
     * @param is the move position that we will check if it is valid
     * @return true if the move is valid and false otherwise 
     */
    public boolean isValidMove(int move)
    {
        int numSpaces = SIZE * SIZE; 
        
        //check if it is in the range 
        if (move < 1 || move > numSpaces)
        {
            return false;
        }
        
        //checking if spot is taken already
        if (isSpotTaken(move))
        {
            return false; 
        }
        
        return true; //if neither of the two checks come up false 
    }
    /** 
     * Determines if there is a winner 
     * 
     * @return the symbol of the winner or null if no one wins 
     */
    
    public String determineWinner()
    {
        //TODO (A level)
        //check all rows
        for (int row = 0; row < SIZE; row++) 
        {
            if (board[row][0] != null && board[row][0].equals(board[row][1]) && board[row][1].equals(board[row][2]))
            {
                return board[row][0];
            }
        }
        
        //check all columns 
        for (int col = 0; col < SIZE; col++)
        {
            if (board[0][col] != null && board[0][col].equals(board[1][col]) && board[1][col].equals(board[2][col]))
            {
                return board[0][col];
            }
        }
        
        //check diagonal (top left, bottom right)
        if (board[0][0] != null && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
        {
            return board[0][0];
        }
        //check other diagonal 
        if (board[0][2] != null && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
        {
            return board[0][2];
        }
        
        return null; //means that no winner was found 
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
