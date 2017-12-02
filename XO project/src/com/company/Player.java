package com.company;


public class Player {

    int[] moves;

    Player(boolean isFirstPlayer) {
        if (isFirstPlayer) {
            moves = new int[5];
        } else {
            moves = new int[4];
        }
    }

    public int [] addMove(int position) {
        for (int i = 0; i < moves.length; i++) {
            if (moves[i] == 0) {
                moves[i] = position;
            break;
            }
        }
        return moves;
    }
}
