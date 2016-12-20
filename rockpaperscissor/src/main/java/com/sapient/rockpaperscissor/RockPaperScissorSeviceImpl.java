package com.sapient.rockpaperscissor;

public class RockPaperScissorSeviceImpl implements RockPaperScissorSevice{

    @Override
    public Player determime(Player first, Player second) {

        if (first.equals(second)) {
            throw new IllegalArgumentException("Invalid argument.");
        }
        switch (first) {
        case PAPER:
            return paperWinCase(second);
        case ROCK:
            return rockWinCase(second);
        case SCISSOR:
            return scissorWinCase(second);

        default:
            throw new IllegalArgumentException("Invalid argument.");
        }
    }

    private Player scissorWinCase(Player second) {
        if (second.equals(Player.PAPER)) {
            return Player.SCISSOR;
        }
        return second;
    }

    private Player rockWinCase(Player second) {
        if (second.equals(Player.SCISSOR)) {
            return Player.ROCK;
        }
        return second;
    }

    private Player paperWinCase(Player second) {
        if (second.equals(Player.ROCK)) {
            return Player.PAPER;
        }
        return second;

    }

}
