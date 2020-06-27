package chess.Pieces;

import chess.Board;
import chess.Box;

public class Knight extends Piece {

    public Knight(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {

        if(end.getPiece()!=null && start.getPiece().isWhite()==end.getPiece().isWhite())
        return false;

        int a = Math.abs(start.getX()-end.getX());
        int b = Math.abs(start.getY()-end.getY());

        return a*b==2;
    }
}
