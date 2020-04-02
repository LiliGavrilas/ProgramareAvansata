package com.company;

public class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private int progressionSize;
    private float time;
    private Boolean gameOver;

    public Game(Player player1, Player player2, Board board, int progressionSize, float time) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
        this.progressionSize = progressionSize;
        this.time = time;
        this.gameOver= false;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public int getProgressionSize() {
        return progressionSize;
    }

    public void setProgressionSize(int progressionSize) {
        this.progressionSize = progressionSize;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public Boolean getGameOver() {
        return gameOver;
    }

    public void setGameOver(Boolean gameOver) {
        this.gameOver = gameOver;
    }



    public void  start()///incepem jocul
    {
        Thread player1Thread = new Thread(player1);///Thread t = new Thread(Runnable target);
        Thread player2Thread = new Thread(player2);
        Thread timeThread = new Thread( () ->{
            try {
                Thread.sleep((long) time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            gameOver=true;
        });
        player1Thread.start();///pornim thread
        player2Thread.start();
        timeThread.start();
    }


}
