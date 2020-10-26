package chess;

import chess.enums.Players;

public class MainClassChess {

    public static void main(String[] args) throws Exception {
           Game game = new Game();
           game.startGame();
           //Players.one,0,0,1,1 this can be part of move class
           game.playerMove(Players.one,0,0,1,1);
           game.playerMove(Players.one,0,0,0,5);
           game.playerMove(Players.one,0,1,2,2);
    }
}
