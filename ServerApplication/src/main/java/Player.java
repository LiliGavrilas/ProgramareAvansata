import java.net.Socket;

public class Player {
    Piece piece;

    public Boolean makeMove(int i, int j, Board board)
    {
        if(board.isLegalMove(i,j, piece).equals(true))
        {
            board.addPiece(i,j , piece);
            return true;
        }
        else
        {
            return false;
        }
    }


}
