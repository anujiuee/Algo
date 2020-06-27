package chess.Pieces;

import chess.Board;
import chess.Box;

public abstract class Piece {

    private boolean iskilled = false;
    private boolean isWhite = false;

    public Piece(boolean white) {
        this.isWhite=white;
    }

    public boolean isIskilled() {
        return iskilled;
    }

    public void setIskilled(boolean iskilled) {
        this.iskilled = iskilled;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public abstract boolean canMove(Board board, Box start, Box end);
}
