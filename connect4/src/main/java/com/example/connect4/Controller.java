package com.example.connect4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.scene.layout.GridPane;
import javafx.scene.shape.Shape;


public class Controller {
    // Constants for Y-axis range
    final int Y_START = 50;
    final int Y_END = 445;
    final int COLUMN_WIDTH = 57;

    // Constants for X-axis range of each column
    final double FIRST_COLUMN_X_START = 11;
    final double FIRST_COLUMN_X_END = 68;
    final double SECOND_COLUMN_X_START = 78;
    final double SECOND_COLUMN_X_END = 135;
    final double THIRD_COLUMN_X_START = 145;
    final double THIRD_COLUMN_X_END = 202;
    final double FOURTH_COLUMN_X_START = 212;
    final double FOURTH_COLUMN_X_END = 269;
    final double FIFTH_COLUMN_X_START = 279;
    final double FIFTH_COLUMN_X_END = 336;
    final double SIXTH_COLUMN_X_START = 346;
    final double SIXTH_COLUMN_X_END = 403;
    final double SEVENTH_COLUMN_X_START = 413;
    final double SEVENTH_COLUMN_X_END = 460;

    // Common Rectangle used to track the current column
    public Rectangle currentColumn;

    GameBoard gameBoard;
    FXMLVariables fxmlVariables;

    public Controller(GameBoard gameBoard, FXMLVariables fxmlVariables) {
        this.gameBoard = gameBoard;
        this.fxmlVariables = fxmlVariables;
    }

    int[][] board = gameBoard.getBoard();
    int rows = gameBoard.getRows();


    public static String PLAYER_ONE = "Player One";
    public static String PLAYER_TWO = "Player Two";


    // FXML annotations for individual column Rectangles
    @FXML
    public Rectangle firstColumn;
    @FXML
    public Rectangle secondColumn;
    @FXML
    public Rectangle thirdColumn;
    @FXML
    public Rectangle fourthColumn;
    @FXML
    public Rectangle fifthColumn;
    @FXML
    public Rectangle sixthColumn;
    @FXML
    public Rectangle seventhColumn;

    // List to store individual column Rectangles
    final List<Rectangle> columnRectangles = new ArrayList<>();

    // Initialize method to add individual columns to the list
    @FXML
    public void initialize() {
        // Add individual columns to the list
        columnRectangles.add(firstColumn);
        columnRectangles.add(secondColumn);
        columnRectangles.add(thirdColumn);
        columnRectangles.add(fourthColumn);
        columnRectangles.add(fifthColumn);
        columnRectangles.add(sixthColumn);
        columnRectangles.add(seventhColumn);
    }

    final ArrayList<Shape> columnsList = new ArrayList<>();
    @FXML
    public void initializeColumnsWithCircles() {
        // Add individual columns to the list
        columnsList.addAll(Arrays.asList(fxmlVariables.getFirst()));
        columnsList.addAll(Arrays.asList(fxmlVariables.getSecond()));
        columnsList.addAll(Arrays.asList(fxmlVariables.getThird()));
        columnsList.addAll(Arrays.asList(fxmlVariables.getFourth()));
        columnsList.addAll(Arrays.asList(fxmlVariables.getFifth()));
        columnsList.addAll(Arrays.asList(fxmlVariables.getSixth()));
        columnsList.addAll(Arrays.asList(fxmlVariables.getSeventh()));

    }


    // Enum to represent players
    private enum Player {
        ONE, TWO
    }

    // Variable to keep track of the current player
    private Player currentPlayer;

    // Updates the visual representation of the board based on the provided state
    public void updateBoard(char[][] newBoardState) {

    }

    //add shape
    public void addCircle(int columnIndex, Circle currentCircle) {
        Circle circle = new Circle(28);

        if (currentPlayer == Player.ONE) {
            circle.setFill(Color.RED);
        } else {
            circle.setFill(Color.BLUE);
        }

        // Increment the player for the next turn
        currentPlayer = (currentPlayer == Player.ONE) ? Player.TWO : Player.ONE;

        // Add the circle to the corresponding column in the GridPane
        //boardGridPane.add(circle, columnIndex, 0);

        if (setColumnVisibility(currentColumn, true) && isCircleWhite(currentCircle)) {
            fxmlVariables.boardGridPane.add(circle, GridPane.getRowIndex(currentColumn), GridPane.getColumnIndex(currentColumn));
        }


        /*
        // Add the circle to the corresponding column in the GridPane
        if (setColumnVisibility(columnRectangles.get(columnIndex), true) && isCircleWhite(currentCircle)) {
            boardGridPane.add(circle, GridPane.getRowIndex(columnRectangles.get(columnIndex)), columnIndex);
        }*/
    }

    private boolean isCircleWhite(Circle circle) {
        return circle.getFill().equals(Color.WHITE);
    }


    public void setPlayerOneName(ActionEvent actionEvent) {
        fxmlVariables.setNamesButton.setOnAction(event ->
        {
            PLAYER_ONE = fxmlVariables.playerTwoNameLabel.getText();
        });
    }

    public void setPlayerTwoName(ActionEvent actionEvent) {
        fxmlVariables.setNamesButton.setOnAction(event ->
        {
            PLAYER_TWO = fxmlVariables.playerTwoNameLabel.getText();
        });
    }

    public void setNames(ActionEvent actionEvent) {
        fxmlVariables.setNamesButton.setOnAction(event ->
        {
            PLAYER_ONE = fxmlVariables.playerTwoNameLabel.getText();
            PLAYER_TWO = fxmlVariables.playerTwoNameLabel.getText();
        });
    }


    public boolean setColumnVisibility(Rectangle column, boolean isVisible) {
        column.setVisible(isVisible);
        return isVisible;
        //columnRectangles.get(columnIndex).setVisible(isVisible);
    }


    // Helper method to get the X-axis start coordinate of a column
    private double getColumnXStart(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> FIRST_COLUMN_X_START;
            case 1 -> SECOND_COLUMN_X_START;
            case 2 -> THIRD_COLUMN_X_START;
            case 3 -> FOURTH_COLUMN_X_START;
            case 4 -> FIFTH_COLUMN_X_START;
            case 5 -> SIXTH_COLUMN_X_START;
            case 6 -> SEVENTH_COLUMN_X_START;
            default -> throw new IllegalArgumentException("Invalid column index: " + columnIndex);
        };
    }

    // Helper method to get the X-axis end coordinate of a column
    private double getColumnXEnd(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> FIRST_COLUMN_X_END;
            case 1 -> SECOND_COLUMN_X_END;
            case 2 -> THIRD_COLUMN_X_END;
            case 3 -> FOURTH_COLUMN_X_END;
            case 4 -> FIFTH_COLUMN_X_END;
            case 5 -> SIXTH_COLUMN_X_END;
            case 6 -> SEVENTH_COLUMN_X_END;
            default -> throw new IllegalArgumentException("Invalid column index: " + columnIndex);
        };
    }

    // Helper method to get the Rectangle corresponding to a column index
    Rectangle getColumnIndex(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> firstColumn;
            case 1 -> secondColumn;
            case 2 -> thirdColumn;
            case 3 -> fourthColumn;
            case 4 -> fifthColumn;
            case 5 -> sixthColumn;
            case 6 -> seventhColumn;
            default -> throw new IllegalArgumentException("Invalid column index: " + columnIndex);
        };
    }

    // Method to update column visibility on mouse enter
    public int updateColumnVisibilityOnMouseEnter(MouseEvent event) {
        double x = event.getSceneX();
        double y = event.getSceneY();
        System.out.println("X: " + x + ",    Y: " + y);

        if (y > Y_START && y < Y_END) {
            for (int i = 0; i < columnRectangles.size(); i++) {
                if (x > getColumnXStart(i) && x < getColumnXEnd(i)) {
                    setColumnVisibility(getColumnIndex(i), true);
                    currentColumn = getColumnIndex(i);
                    // Update the game board based on the current column
                    updateBoard(i);
                   //System.out.println(updateBoard(i));
                    System.out.println(Arrays.toString(board));

                } else {
                    setColumnVisibility(getColumnIndex(i), false);
                }
            }
        }
        return 0;
    }

    private boolean updateBoard(int columnIndex) {
        for (int row = rows - 1; row >= 0; row--) {
            if (board[row][columnIndex] == 0) {
                board[row][columnIndex] = (currentPlayer == Player.ONE) ? 1 : 2;
                break;
            }
        }
        return false;
    }

    public void resetColumnVisibilityOnMouseExit(MouseEvent event) {
        for (Rectangle column : columnRectangles) {
            setColumnVisibility(column, true);
        }
    }
}





