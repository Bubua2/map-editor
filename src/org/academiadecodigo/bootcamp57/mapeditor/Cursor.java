package org.academiadecodigo.bootcamp57.mapeditor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Cursor{

    private Grid grid;
    private Rectangle cursor;



    public Cursor(Grid grid){
        this.grid = grid;
        this.cursor = new Rectangle(grid.getPADDING(), grid.getPADDING(), grid.getCellSize(), grid.getCellSize());
        cursor.setColor(Color.PINK);
        cursor.fill();
    }

    public void moveUp(){
        if(cursor.getY() > grid.getCellSize()) {
            cursor.translate(0, -grid.getCellSize());
        }
    }
    public void moveDown(){
        if (cursor.getY() < grid.getPxMaxHeight() - grid.getCellSize()){
            cursor.translate(0, grid.getCellSize());
        }
    }
    public void moveRight(){
        if(cursor.getX() < grid.getPxMaxWidth() - grid.getCellSize()){
            cursor.translate(grid.getCellSize(), 0);
        }
    }
    public void moveLeft(){
        if(cursor.getX() > grid.getCellSize()){
            cursor.translate(- grid.getCellSize(), 0);
        }
    }

    public int getX(){
       return cursor.getX();
    }
    public int getY(){
        return cursor.getY();
    }

}
