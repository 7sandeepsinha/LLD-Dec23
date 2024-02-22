package projects.TicTacToe.model;

import java.util.Scanner;

public class Player {
    private int id;
    private String name;
    private char symbol;
    private PlayerType playerType;

    public Player() {
    }

    public Player(int id, String name, char symbol, PlayerType playerType) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Move makeMove(Board board){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row for the target cell");
        int row = sc.nextInt();
        System.out.println("Enter the col for the target cell");
        int col = sc.nextInt();

        //TODO: validate the row and col entered by the player | ex : inbound checks, filled or not filled etc.

        Cell playedMoveCell = board.getMatrix().get(row).get(col);
        playedMoveCell.setCellState(CellState.FILLED);
        playedMoveCell.setPlayer(this);

        return new Move(playedMoveCell, this);
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
