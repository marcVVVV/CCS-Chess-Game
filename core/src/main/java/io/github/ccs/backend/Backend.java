/** Persistence, settings, and platform-independent service code. */
package io.github.ccs.backend;

//This is the main class that runs the chess game.

public class Backend {
    public static void main(String[] args) {
        Board board = new Board();
        board.board();
    }
}
