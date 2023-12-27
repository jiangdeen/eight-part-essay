package com.jde.algorithm;

/**
 * 02 保龄球
 */
public class Bowling {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = score(player1);
        int score2 = score(player2);
        if (score1==score2) return 0;
        return  score1>score2? 1:2;
    }

    private int score(int[] player) {
        int score = 0;
        for (int i = 0; i < player.length; i++) {
            if ((i >= 1 && player[i - 1] == 10) || (i >= 2 && player[i - 2] == 10)) {
                score += (2 * player[i]);
            } else {
                score += player[i];
            }
        }
        return score;
    }

}
