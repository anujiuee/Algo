package chess.Pieces;

import chess.Board;
import chess.Box;

public class King extends Piece {

    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        if(this.isWhite()==end.getPiece().isWhite())
            return false;

        int a = Math.abs(start.getX()-end.getX());
        int b = Math.abs(start.getY()-end.getY());

        return a+b==1;
    }
}
