package Models;

import java.util.Arrays;

public class GameModel {

    // row boundary
    private  int row_boundary;

    // column boundary
    private  int column_boundary;

    // game board
    private int[][] board;

    // player cell position


    private Pair Rock1;
    private Pair Rock2;
    private Pair Rock3;
    private Pair Rock4;
    private Pair Rock5;
    private Pair Rock6;
    private Pair Rock7;
    private Pair Rock8;

    private Pair player;
    private Pair Plant1;
    private  Pair Plant2;


    private Positions lastPosition;

//
    public GameModel(int row_boundary, int column_boundary, int[][] board, Pair Rock1,Pair Rock2,Pair Rock3,Pair Rock4,Pair Rock5,Pair Rock6,Pair Rock7,Pair Rock8)
    {
        this.row_boundary = row_boundary;
        this.column_boundary = column_boundary;
        this.board = board;
        this.Rock1=Rock1;
        this.Rock2=Rock2;
        this.Rock3=Rock3;
        this.Rock4=Rock4;
        this.Rock5=Rock5;
        this.Rock6=Rock6;
        this.Rock7=Rock7;
        this.Rock8=Rock8;
    }

    // copy constructor (Deep Copy)
//    public GameModel(GameModel gameModel)
//    {
//        this.row_boundary = gameModel.row_boundary;
//        this.column_boundary = gameModel.column_boundary;
//
//        this.board = new int[row_boundary][column_boundary];
//
//        for(int i=0; i<this.row_boundary; i++)
//        {
//            for(int j=0; j< this.column_boundary; j++)
//            {
//                this.board[i][j] = gameModel.board[i][j];
//            }
//        }
////        this.board = gameModel.board.clone(); // array deep copy
//
//        this.player = new Pair(gameModel.player); // pair deep copy
//        this.Plant1=new Pair(gameModel.Plant1);
//        this.Plant2=new Pair(gameModel.Plant2);
//    }
//
//    // Deep Check
//    public boolean equals(GameModel obj) {
//
//        return
//                obj.player.equals(this.player)
//                && Arrays.deepEquals(this.board, obj.board);
//    }


    // Getter Methods
    public int getRow_boundary() {
        return row_boundary;
    }

    public int getColumn_boundary() {
        return column_boundary;
    }

    public int[][] getBoard() {
        return board;
    }

//    public Pair getPlayer() {
//        return player;
//    }
//
//    public Pair getPlant1() {
//        return Plant1;
//    }
//
//    public Pair getPlant2() {
//        return Plant2;
//    }

    public Positions getLastPosition() {
        return lastPosition;
    }

    public void setLastPosition(Positions lastPosition) {
        this.lastPosition = lastPosition;
    }
}
