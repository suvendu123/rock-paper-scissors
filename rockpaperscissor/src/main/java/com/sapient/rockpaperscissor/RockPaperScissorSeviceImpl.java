package com.sapient.rockpaperscissor;

public class RockPaperScissorSeviceImpl implements RockPaperScissorSevice{

    @Override
    public Player determime(Player first, Player second) {

        if (first.equals(second)) {
            throw new IllegalArgumentException("Invalid argument.");
        }
        switch (first) {
        case PAPER:
            return returnPaperWinCase(second);
        case ROCK:
            return returnRockWinCase(second);
        case SCISSOR:
            return returnScissorWinCase(second);

        default:
            throw new IllegalArgumentException("Invalid argument.");
        }
    }

    private Player returnScissorWinCase(Player second) {
        if (second.equals(Player.PAPER)) {
            return Player.SCISSOR;
        }
        return second;
    }

    private Player returnRockWinCase(Player second) {
        if (second.equals(Player.SCISSOR)) {
            return Player.ROCK;
        }
        return second;
    }

    private Player returnPaperWinCase(Player second) {
        if (second.equals(Player.ROCK)) {
            return Player.PAPER;
        }
        return second;

    }

}
