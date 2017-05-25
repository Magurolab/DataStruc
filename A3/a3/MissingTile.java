public class MissingTile {

    public static void tileGrid(Grid board) {
        int boardSize = board.size();
        int colX = board.getPaintedCellX();
        int colY = board.getPaintedCellY();
        fillGrid(board, 0,0,boardSize-1,boardSize-1,board.getPaintedCellX(),board.getPaintedCellY());

    }
    public static void fillGrid(Grid grid,int topX, int topY, int rimX, int rimY, int ptX, int ptY){
        int size = rimX - topX;
        if(size>=1){
            int half_len = size/2;
            /// Q1
            if(ptX <= topX+half_len && ptY <= topY+half_len){

                    grid.setTile(topX+half_len,topY+half_len,3);

                    fillGrid(grid,topX,topY,topX+half_len,topY+half_len,ptX,ptY);

                    fillGrid(grid,rimX-half_len,topY,rimX,topY+half_len,rimX-half_len,topY+half_len);

                    fillGrid(grid,topX,rimY-half_len,topX+half_len,rimY,topX+half_len,rimY-half_len);

                    fillGrid(grid,rimX-half_len,rimY-half_len,rimX,rimY,rimX-half_len,rimY-half_len);

                }
                // Q2
            else if(ptX <= topX+half_len && ptY >= topY+half_len){{

                    grid.setTile(topX+half_len,rimY-half_len, 2);

                    fillGrid(grid,topX,topY,topX+half_len,topY+half_len,topX+half_len,topY+half_len);

                    fillGrid(grid,rimX-half_len,topY,rimX,topY+half_len,rimX-half_len,topY+half_len);

                    fillGrid(grid,topX,rimY-half_len,topX+half_len,rimY,ptX,ptY);

                    fillGrid(grid,rimX-half_len,rimY-half_len,rimX,rimY,rimX-half_len,rimY-half_len);
                }

            }
            // On the right
            else if(ptX >= topX+half_len && ptY <= topY+half_len){

                    grid.setTile(rimX-half_len,topY+half_len,0);

                    fillGrid(grid,topX,topY,topX+half_len,topY+half_len,topX+half_len,topY+half_len);

                    fillGrid(grid,rimX-half_len,topY,rimX,topY+half_len,ptX,ptY);

                    fillGrid(grid,topX,rimY-half_len,topX+half_len,rimY,topX+half_len,rimY-half_len);

                    fillGrid(grid,rimX-half_len,rimY-half_len,rimX,rimY,rimX-half_len,rimY-half_len);
                }
                // Q4
            else{
                    grid.setTile(rimX-half_len,rimY-half_len,1);

                    fillGrid(grid,topX,topY,topX+half_len,topY+half_len,topX+half_len,topY+half_len);

                    fillGrid(grid,rimX-half_len,topY,rimX,topY+half_len,rimX-half_len,topY+half_len);

                    fillGrid(grid,topX,rimY-half_len,topX+half_len,rimY,topX+half_len,rimY-half_len);

                    fillGrid(grid,rimX-half_len,rimY-half_len,rimX,rimY,ptX,ptY);

                }



            }




        }
    }


