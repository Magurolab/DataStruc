public class MissingTile_myver {
    public static void main(String[] args) {
        Grid board = new BasicBoard(4, 0, 0);
        MissingTile_myver.tileGrid(board);
    }
  public static void tileGrid(Grid board) {
    // TODO: implement me!
      int ptx = board.getPaintedCellX();
      int pty = board.getPaintedCellY();
      int headx = 0;
      int heady = 0;
      int rimx = board.size()-1;
      int rimy = board.size()-1;

      FILLIN(board, headx, heady, rimx, rimy, ptx, pty);



  }

  public static void FILLIN(Grid board,int headx, int heady,int rimx, int rimy,int ptx, int pty){
     int midx = (rimx - headx)/2;
      System.out.println("here"+midx);
     int midy = (rimy - heady)/2;

      System.out.println("Head X: "+ headx);
      System.out.println("Head Y: "+ heady);
      System.out.println();


      int Q = paintAtMidpoint(board,headx+midx,heady+midy,ptx,pty);
      if(rimx-headx >=1){

      if (Q == 1) {
          System.out.println("Q1");

          FILLIN(board, headx, heady, headx+midx, heady+midy, ptx, pty);// Q1
          FILLIN(board, rimx-midx, heady, rimx, rimy-midy,headx+midx+1, heady+midy );//Q2
          FILLIN(board, headx,rimy-midy, headx+midx,rimy-midy,headx+midx, heady+midy+1);//Q3
          FILLIN(board, rimx-midx, rimy-midy, rimx,rimy,rimx-midx,rimy-midy);//Q4


      }
      else if(Q == 2){
          System.out.println("Q2");
          FILLIN(board, headx, heady, headx+midx, heady+midy,headx+midx, heady+midy );// Q1
          FILLIN(board, rimx-midx, heady, rimx, rimy-midy,ptx, pty );//Q2
          FILLIN(board, headx,rimy-midy, headx+midx,rimy-midy,headx+midx, heady+midy+1);//Q3
          FILLIN(board, rimx-midx, rimy-midy, rimx,rimy,rimx-midx,rimy-midy);//Q4
      }
      else if(Q == 3){
          System.out.println("Q3");
          FILLIN(board, headx, heady, headx+midx, heady+midy,headx+midx, heady+midy );// Q1
          FILLIN(board, rimx-midx, heady, rimx, rimy-midy,headx+midx+1, heady+midy );//Q2
          FILLIN(board, headx,rimy-midy, headx+midx,rimy-midy,ptx, pty);//Q3
          FILLIN(board, rimx-midx, rimy-midy, rimx,rimy,rimx-midx,rimy-midy);//Q4
      }
      else if(Q == 4){
          System.out.println("Q4");
          FILLIN(board, headx, heady, headx+midx, heady+midy,headx+midx, heady+midy );// Q1
          FILLIN(board, rimx-midx, heady, rimx, rimy-midy,headx+midx+1, heady+midy );//Q2
          FILLIN(board, headx,rimy-midy, headx+midx,rimy-midy,headx+midx, heady+midy+1);//Q3
          FILLIN(board, rimx-midx, rimy-midy, rimx,rimy,ptx,pty);//Q4

      }
      }
  }


  public static int paintAtMidpoint(Grid board,int midx,int midy, int paintedpointX, int paintedpointY){


      int paintx = paintedpointX;
      int painty = paintedpointY;


      if(midx < paintx && midy < painty){ // Q4
          System.out.println("SET Q4");
          board.setTile(midx +1, midy+1,1);
          System.out.println("SET X AT " + midx+1);
          System.out.println("SET Y AT " + midy +1);
          System .out.println();

          return 4;



      }
      else if(midx < paintx && midy >= painty){//Q2
          System.out.println("SET Q2");
          board.setTile(midx+1 , midy,0);
          System.out.println("SET X AT " + midx+1);
          System.out.println("SET Y AT " + midy );
          System .out.println();

          return 2;


      }
      else if(midx >= paintx && midy < painty){//Q3
          System.out.println("SET Q3");
          board.setTile(midx , midy+1,2);
          System.out.println("SET X AT " + midx);
          System.out.println("SET Y AT " + midy +1);
          System .out.println();

          return 3;

      }
      else{//Q1
          System.out.println("SET Q1");
          board.setTile(midx, midy,3);
          System.out.println("SET X AT " + midx);
          System.out.println("SET Y AT " + midy);
          System .out.println();
          return 1;


      }
  }







}
