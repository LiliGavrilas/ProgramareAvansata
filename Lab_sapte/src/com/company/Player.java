package com.company;

import java.util.List;

public class Player implements Runnable{
   private List<Token> extractedTokens;
   private Game game;

    public Player(List<Token> extractedTokens, Game game) {
        this.extractedTokens = extractedTokens;
        this.game = game;
    }

    public List<Token> getExtractedTokens() {
        return extractedTokens;
    }

    public void setExtractedTokens(List<Token> extractedTokens) {
        this.extractedTokens = extractedTokens;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }



    public synchronized void makeMove( )
    {

        var availableTokens = game.getBoard().getTokens();
        if(availableTokens.isEmpty())///nu mai avem miscari
        {
            return;
        }
        int randomIndex= (int) (Math.random()*availableTokens.size());///indexul token extras random
        extractedTokens.add(availableTokens.get(randomIndex));///am adaugat tokenul extras la lista jucatorului
        availableTokens.remove(randomIndex);//stergem tokenul din avaibel token
    }

    @Override
    public void run() {
        while(!game.getGameOver())
        {
            try
            {
                makeMove();
            }catch (Exception e){}
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "extractedTokens=" + extractedTokens +
                ", game=" + game +
                '}';
    }
}
