package chess.Pieces;

import chess.Board;
import chess.Box;
import chess.Pieces.Piece;

public class Rook extends Piece {

    public Rook(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        return false;
    }
}
