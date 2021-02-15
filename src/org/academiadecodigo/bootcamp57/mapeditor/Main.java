package org.academiadecodigo.bootcamp57.mapeditor;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

public class Main {

    public static void main(String[] args){

        Grid grid = new Grid(35, 35);
        grid.drawCells();
        Cursor cursor = new Cursor(grid);
        CursorKeyboardHandler cursorKeyboardHandler = new CursorKeyboardHandler(grid, cursor);
        Keyboard keyboard = new Keyboard(cursorKeyboardHandler);
        KeyboardEvent keyboardEvent = new KeyboardEvent();
        keyboard.addEventListener(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_Q, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_C, KeyboardEventType.KEY_PRESSED);
    }
}
