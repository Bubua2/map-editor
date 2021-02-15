package org.academiadecodigo.bootcamp57.mapeditor;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import java.util.ArrayList;

public class Grid {
    private static final int PADDING = 10;
    private static final int CELL_SIZE = 25;
    private int cols;
    private int rows;
    private int pxMaxHeight;
    private int pxMaxWidth;
    private ArrayList<Rectangle> gridCellList = new ArrayList<>();

    public Grid (int cols, int rows){
       this.cols = cols;
       this.rows = rows;
       pxMaxHeight = rows * CELL_SIZE;
       pxMaxWidth = cols * CELL_SIZE;
       new Rectangle(PADDING, PADDING, pxMaxHeight, pxMaxWidth).draw();

    }

    public void drawCells(){
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
               Rectangle cell = new Rectangle(PADDING + (j * CELL_SIZE), PADDING + (i*CELL_SIZE), CELL_SIZE, CELL_SIZE);
               cell.draw();
               gridCellList.add(cell);
            }
        }
    }

    public static int getCellSize() {
        return CELL_SIZE;
    }

    public static int getPADDING() {
        return PADDING;
    }

    public int getPxMaxHeight() {
        return pxMaxHeight;
    }

    public int getPxMaxWidth() {
        return pxMaxWidth;
    }

    public void paintBlack(int x, int y){
        for (Rectangle cell: gridCellList) {
            if(cell.getX() == x && cell.getY() == y){
                cell.fill();
            }
        }
    }

    public void clear(){
        for (Rectangle cell: gridCellList) {
            if(cell.isFilled()){
                cell.draw();
            }
        }
    }


}
