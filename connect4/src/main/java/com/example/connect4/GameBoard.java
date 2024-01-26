package com.example.connect4;

import javafx.scene.shape.Circle;

import java.awt.*;

public class GameBoard {
    Controller controller;
    FXMLVariables variables;
    public int rows = 6;
    public int columns = 7;
    // The internal representation of the game board
    private int[][] board = new int[rows][columns];

    public GameBoard() {
        this.board = new int[rows][columns];
    }




    private enum Player {
        ONE, TWO
    }


    // Gets the current state of the game board
    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
