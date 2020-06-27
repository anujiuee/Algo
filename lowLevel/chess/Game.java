package chess;

import chess.Pieces.King;
import chess.Pieces.Piece;
import chess.enums.Players;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Players playersTurn;
    private Board board;

    //add all move here
    private List<Move> movesPlayed;

    public void startGame(){
        board = new Board();
        playersTurn = Players.one;
        movesPlayed = new ArrayList<>();
    }

    public boolean playerMove(Players player, int startX, int startY, int endX, int endY) throws Exception {
        if(player!=playersTurn)  return  false;

        Box startBox = board.getBox(startX,startY);
        Box endBox = board.getBox(endX,endY);
        Piece piece = startBox.getPiece();

        if(!piece.canMove(board,startBox,endBox)){
          return false;
        }

        Piece destPiece = endBox.getPiece();

        //kill
        if(destPiece!=null){
            endBox.getPiece().setIskilled(true);
        }

        //move
        endBox.setPiece(piece);
        startBox.setPiece(null);

        if (destPiece != null && destPiece instanceof King) {
            if(player ==Players.one) {
                System.out.println("one win");
            } else {
                System.out.println("two win");
            }
        }


        if(player==Players.one){
            playersTurn = Players.two;
        } else {
            playersTurn = Players.one;
        }

        return true;
    }

}
