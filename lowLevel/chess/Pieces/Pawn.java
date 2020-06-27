package chess.Pieces;

import chess.Board;
import chess.Box;

public class Pawn extends Piece {

    public Pawn(boolean white) {
        super(white);
    }
    @Override
    public boolean canMove(Board board, Box start, Box end) {
        return false;
    }
}
