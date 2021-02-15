package org.academiadecodigo.bootcamp57.mapeditor;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class CursorKeyboardHandler implements KeyboardHandler {

    private Grid grid;
    private Cursor cursor;


    public CursorKeyboardHandler(Grid grid, Cursor cursor){
        this.grid = grid;
        this.cursor = cursor;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch(keyboardEvent.getKey()){

            case KeyboardEvent.KEY_UP:
                cursor.moveUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                cursor.moveDown();
                break;
            case KeyboardEvent.KEY_LEFT:
                cursor.moveLeft();
                break;
            case KeyboardEvent.KEY_RIGHT:
                cursor.moveRight();
                break;
            case KeyboardEvent.KEY_S:
                break;
            case KeyboardEvent.KEY_C:
                grid.clear();
                break;
            case KeyboardEvent.KEY_L:
                break;
            case KeyboardEvent.KEY_Q:
                grid.paintBlack(cursor.getX(), cursor.getY());
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {}
}
