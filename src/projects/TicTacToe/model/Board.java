package projects.TicTacToe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> matrix;
    /*
        dimension = 3
        [
            [_, _, _]
            [_, _, _]
            [_, _, _]
        ]
     */

    public Board(int dimension) {
        this.dimension = dimension;
        matrix = new ArrayList<>(); // outside list
        for(int i=0;i<dimension;i++){
            matrix.add(new ArrayList<>()); // adding the internal arraylist
            for(int j=0;j<dimension;j++){
                matrix.get(i).add(new Cell(i,j)); // adding the cells in the internal arraylist
            }
        }
    }

    public void displayBoard(){
        for(int i=0;i<dimension;i++){
            List<Cell> cells = matrix.get(i);
            for(Cell cell : cells){
                cell.displayCell();
            }
            System.out.println();
        }
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
