public class Game {

    Board board;
    Player player1;
    Player player2;
    int turn = 1;

    public Player getWinner() {
        var context = board.boardContext;
        Player blackPlayer;
        Player whitePlayer;
        if (player1.piece.equals(Piece.black)) {
            blackPlayer = player1;
            whitePlayer = player2;
        } else {
            whitePlayer = player1;
            blackPlayer = player2;
        }


        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                int count = 0;
                ////cautam linie castigatoare
                for (int z = 0; z < 5; z++) {
                    if (context[i][j + z] == Piece.black) {
                        count++;

                    }
                    if (context[i][j + z] == Piece.white) {
                        count--;
                    }
                }
                if (count == 5) {
                    return blackPlayer;
                } else if (count == -5) {
                    return whitePlayer;
                }

            }


        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                int count = 0;
                ////cautam coloana castigatoare
                for (int z = 0; z < 5; z++) {
                    if (context[i+z][j] == Piece.black) {
                        count++;

                    }
                    if (context[i+z][j] == Piece.white) {
                        count--;
                    }
                }
                if (count == 5) {
                    return blackPlayer;
                } else if (count == -5) {
                    return whitePlayer;
                }

            }


        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                int count = 0;
                ////cautam diagonala castigatoare
                for (int z = 0; z < 5; z++) {
                    if (context[i+z][j+z] == Piece.black) {//st sus->dr jos
                        count++;

                    }
                    if (context[i+z][j+z] == Piece.white) {
                        count--;
                    }

                }
                if (count == 5) {
                    return blackPlayer;
                } else if (count == -5) {
                    return whitePlayer;
                }

            }


        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                int count = 0;
                ////cautam diagonala castigatoare
                for (int z = 0; z < 5; z++) {
                    if (context[i-z][j+z] == Piece.black) {//st jos->dr sus
                        count++;

                    }
                    if (context[i-z][j+z] == Piece.white) {
                        count--;
                    }

                }
                if (count == 5) {
                    return blackPlayer;
                } else if (count == -5) {
                    return whitePlayer;
                }

            }


        }



        return null;

    }
}




