package src.boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }
    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    //HookMethods - método que faz gancho com subclasse
    public boolean possibleMove(Position position) { //metodo comum utilizndo método abstrato
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i =0; i< mat.length; i++) {
            for (int j = 0; j< mat.length; j++) {
                if(mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }


}
