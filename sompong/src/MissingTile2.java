
public class MissingTile2 {
    //    public static void main(String[] args) {
//        Grid grid = new BasicBoard(8,5,5);
//        tileGrid(grid);
//        System.out.println(grid.isFullyTiled());
//    }
    public static void tileGrid(Grid board) {
        int boardSize = board.size();
        int colX = board.getPaintedCellX();
        int colY = board.getPaintedCellY();
        fillIn(board, 0,0,boardSize-1,boardSize-1,board.getPaintedCellX(),board.getPaintedCellY());

    }
    public static void fillIn(Grid board,int headx, int heady, int rimx, int rimy,int ptx,int pty){
        int size = rimx - rimy;
        int mid_len = size/2;
        if(size>=1){

            // if colored is on West
            if(ptx <= headx+mid_len){
                // if colored is on NW
                if(pty <= heady+mid_len){
                    board.setTile(headx+mid_len,heady+mid_len,3);
                    fillIn(board,headx,heady,headx+mid_len,heady+mid_len,ptx,pty);
                    fillIn(board,rimx-mid_len,heady,rimx,heady+mid_len,rimx-mid_len,heady+mid_len);
                    fillIn(board,headx,rimx-mid_len,headx+mid_len,rimy,headx+mid_len,rimy-mid_len);
                    fillIn(board,rimx-mid_len,rimy-mid_len,rimx,rimy,rimx-mid_len,rimy-mid_len);

                }
                // if colored is on SW
                else{
                    board.setTile(headx+mid_len,rimy-mid_len, 2);
                    fillIn(board,headx,heady,headx+mid_len,heady+mid_len,headx+mid_len,heady+mid_len);
                    fillIn(board,rimx-mid_len,heady,rimx,heady+mid_len,rimx-mid_len,heady+mid_len);
                    fillIn(board,headx,rimy-mid_len,headx+mid_len,pty,ptx,pty);
                    fillIn(board,rimx-mid_len,rimy-mid_len,rimx,rimy,rimx-mid_len,rimy-mid_len);
                }

            }
            //if colored is on East
            else{
                // if colored is on NE
                if(pty<= heady+mid_len){
                    board.setTile(rimx-mid_len,heady+mid_len,0);
                    fillIn(board,headx,heady,headx+mid_len,heady+mid_len,headx+mid_len,heady+mid_len);
                    fillIn(board,rimx-mid_len,heady,rimx,heady+mid_len,ptx,pty);
                    fillIn(board,headx,rimy-mid_len,headx+mid_len,rimy,headx+mid_len,rimy-mid_len);
                    fillIn(board,rimx-mid_len,rimy-mid_len,rimx,rimy,rimx-mid_len,rimy-mid_len);
                }
                // if colored is on SE
                else{
                    board.setTile(rimx-mid_len,rimy-mid_len,1);
                    fillIn(board,headx,heady,headx+mid_len,heady+mid_len,headx+mid_len,heady+mid_len);
                    fillIn(board,rimx-mid_len,heady,rimx,heady+mid_len,rimx-mid_len,heady+mid_len);
                    fillIn(board,headx,rimy-mid_len,headx+mid_len,rimy,headx+mid_len,rimy-mid_len);
                    fillIn(board,rimx-mid_len,rimy-mid_len,rimx,rimy,ptx,pty);

                }



            }




        }
    }

}

