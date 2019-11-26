package se.jacobswenson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ScoreBoard implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Integer> playerScore;
    private List<Integer> opponentScore;
    private int currentRound;

    private boolean lastRound;

    public ScoreBoard() {
        playerScore = new ArrayList<>();
        opponentScore = new ArrayList<>();
        lastRound = false;
        currentRound = 0;
    }

    public int getTotalScorePlayer() {
        return playerScore.stream().mapToInt(e -> e).sum();
    }

    public int getTotalScoreOpponent() {
        return opponentScore.stream().mapToInt(e -> e).sum();
    }

    public List<Integer> getPlayerScore() {
        return playerScore;
    }

    public void addPlayerRoundScore(int score) {
        playerScore.add(0,score);
    }

    public List<Integer> getOpponentScore() {
        return opponentScore;
    }

    public void addOpponentRoundScore(int score) {
        opponentScore.add(0,score);
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public void newRound() {
        this.currentRound++;
    }

    public boolean isLastRound() {
        return lastRound;
    }

    public void setLastRound(boolean lastRound) {
        this.lastRound = lastRound;
    }
}