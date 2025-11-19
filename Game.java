
/**
 * The Game class will handle the overall tic-tac-toe game.
 * It will create the board and players, as well as the game loop/determining when
 * the game is over. 
 *
 * @author Eddie 
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables 
    private Board gameBoard; 
    private Player player1; 
    private Player player2;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        gameBoard = new Board();
        player1 = new Player("X");
        player2 = new Player("O"); 
    }

    public void play() {
        System.out.println("Welcome to Tic-Tac-Toe!");

        displayBoard();
        System.out.println("\n\n\n");

        boolean gameOver = false;
        while (!gameOver) {
            // execute the user's turn
            int move1 = player1.getMove(gameBoard);
            gameBoard.makeMove(move1, player1.getSymbol());

            displayBoard();
            System.out.println("\n\n\n");

            gameOver = isGameOver();

            if (!gameOver) {
                // execute the cpu's turn
                int move2 = player2.getMove(gameBoard);
                gameBoard.makeMove(move2, player2.getSymbol());

                displayBoard();
                System.out.println("\n\n\n");

                gameOver = isGameOver();
            }
        }
        System.out.println("Game over.");
        String winner = gameBoard.determineWinner();
        if (winner == "X") {
            System.out.println("X won!");
        } else if (winner == "O") {
            System.out.println("O won!");
        } else {
            System.out.println("Cat game.");
        }
    }

    private void displayBoard() {
        String[][] board = gameBoard.getBoard();
        int size = gameBoard.getSize();
        String result = "";
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (board[row][col] == null) {
                    result += "   ";
                } else { 
                    result += " " + board[row][col] + " ";
                }
                if (col < size-1) {
                    result += "|";
                }
            }
            if (row < size-1) {
                result += "\n-----------\n";
            }
        }
        System.out.println(result);
    }

    private boolean isGameOver() {
        // two scenarios: either someone gets 3 in a row or the board fills up
        boolean fullBoard = gameBoard.isBoardFull();
        String winner = gameBoard.determineWinner();

        if (fullBoard || winner != null) {
            return true;
        } else {
            return false;
        }
    }
}
