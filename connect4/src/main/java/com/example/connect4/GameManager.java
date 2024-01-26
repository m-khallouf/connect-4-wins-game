package com.example.connect4;

public class GameManager {

    // Reference to the GameBoard instance
    private GameBoard gameBoard;

    // Constructor that takes a GameBoard instance
    public GameManager(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }
    private static final int EMPTY_PLACE = 0;

    /// returns false when a piece cannot be added
    public boolean addPiece(int row, int playerSymbol) {
        for (int i = 0; i < gameBoard.rows; i++) {
            int[][] board = gameBoard.getBoard();
            if (board[row][i] == EMPTY_PLACE) {
                board[row][i] = playerSymbol;
                return true;
            }
        }
        return false;
    }

    // Checks if the specified player has won the game
    public boolean checkForWinner(int playerSymbol) {
        return checkDiagonal(playerSymbol) || checkHorizontal(playerSymbol) || checkVertical(playerSymbol);
    }

    // Checks for a horizontal win on the game board
    private boolean checkHorizontal(int playerSymbol) {
        int[][] board = gameBoard.getBoard();

        for (int i = 0; i < gameBoard.rows; i++) {
            for (int j = 0; j < gameBoard.columns - 3; j++) {
                if (board[i][j] == playerSymbol &&
                        board[i][j + 1] == playerSymbol &&
                        board[i][j + 2] == playerSymbol &&
                        board[i][j + 3] == playerSymbol) {
                    return true;
                }
            }
        }
        return false;
    }

    // Checks for a vertical win on the game board
    private boolean checkVertical(int playerSymbol) {
        int[][] board = gameBoard.getBoard();

        for (int i = 0; i < gameBoard.rows - 3; i++) {
            for (int j = 0; j < gameBoard.columns; j++) {
                if (board[i][j] == playerSymbol &&
                        board[i + 1][j] == playerSymbol &&
                        board[i + 2][j] == playerSymbol &&
                        board[i + 3][j] == playerSymbol) {
                    return true;
                }
            }
        }
        return false;
    }

    // Checks for a diagonal win on the game board
    private boolean checkDiagonal(int playerSymbol) {
        int[][] board = gameBoard.getBoard();

        for (int i = 0; i < gameBoard.rows - 3; i++) {
            for (int j = 0; j < gameBoard.columns - 3; j++) {
                if ((board[i][j] == playerSymbol &&
                        board[i + 1][j + 1] == playerSymbol &&
                        board[i + 2][j + 2] == playerSymbol &&
                        board[i + 3][j + 3] == playerSymbol )
                    ||
                        (board[i][j + 3] == playerSymbol &&
                                board[i + 1][j + 2] == playerSymbol &&
                                board[i + 2][j + 1] == playerSymbol &&
                                board[i + 3][j] == playerSymbol)) {
                    return true;
                }
            }
        }
        return false;
    }
}
