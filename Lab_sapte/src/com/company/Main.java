package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(new LinkedList<>(), null);
        Player player2 = new Player(new LinkedList<>(),null);

        List<Token> randomTokens = new LinkedList<>();
        for (int i=0; i<100;i++)
        {
            int randomInt= (int) (Math.random()*1000);
            randomTokens.add(new Token(randomInt));
        }
        Board board = new Board(randomTokens);

        Game game = new Game(player1,player2, board, 10, 2);
        player1.setGame(game);
        player2.setGame(game);
        game.start();

        System.out.println(player1);
        System.out.println(player2);


    }
}
