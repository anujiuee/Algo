package chess;

import chess.Pieces.Knight;
import chess.Pieces.Pawn;
import chess.Pieces.Rook;

public class Board {
    Box [][] boxes;

    public Board() {
        this.initializeBoard();
    }

    public Box getBox(int x, int y) throws Exception {

        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }

        return boxes[x][y];
    }

    private void initializeBoard() {
        boxes = new Box[64][64];

        //white
        boxes[0][0] = new Box(0,0,new Rook(true));
        boxes[0][1] = new Box(0, 1, new Knight(true));

        boxes[1][0] = new Box(1, 0, new Pawn(true));
        boxes[1][1] = new Box(1, 1, new Pawn(true));

        //black
        boxes[7][0] = new Box(0,0,new Rook(false));
        boxes[7][1] = new Box(0, 1, new Knight(false));

        boxes[6][0] = new Box(1, 0, new Pawn(false));
        boxes[6][1] = new Box(1, 1, new Pawn(false));

        for (int i=2;i<6;i++){
            for (int j=0;j<8;j++){
                boxes[i][j] = new Box(i,j,null);
            }
        }

    }
}
