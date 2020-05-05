public class Board {
     Piece boardContext [][];

    public Board() {
        this.boardContext = new Piece[15][15];
        for(int i=0; i<=15;i++)
        {
            for (int j=0;j<15;j++){
                boardContext[i][j]=Piece.freeSpace;
            }
        }
    }

    public Boolean isLegalMove(int i , int j, Piece p)
    {
        if(boardContext[i][j].equals(Piece.freeSpace))
        {
            return true;
        }
        else{
            return false;
        }
    }
    public void addPiece( int i , int j, Piece p)
    {

        boardContext[i][j]=p;
    }

}
