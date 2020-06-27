package chess;

import chess.enums.Players;

public class MainClassChess {

    public static void main(String[] args) throws Exception {
           Game game = new Game();
           game.startGame();
           game.playerMove(Players.one,0,0,1,1);
           game.playerMove(Players.one,0,0,0,5);
           game.playerMove(Players.one,0,1,2,2);
    }
}
