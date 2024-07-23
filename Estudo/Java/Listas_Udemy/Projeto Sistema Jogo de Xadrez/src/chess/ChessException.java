package src.chess;

import src.boardgame.BoardException;

public class ChessException extends BoardException {
    private static long serialVersionUID = 1L;

    public ChessException(String message){
        super(message);
    }
}
