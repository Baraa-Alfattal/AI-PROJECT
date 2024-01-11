import Models.GameModel;
import Models.Pair;

public class GameLevel {

//    public static GameModel level1()
//    {
//        int board[][] = {
//                {0, 0, 0, 0, 0, 0},
//                {0, 1, 1, 1, 1, 0},
//                {0, 1, 1, 3, 4, 0},
//                {0, 1, 2, 1, 1, 0},
//                {0, 1, 1, 3, 4, 0},
//                {0, 0, 0, 0, 0, 0},
//        };
//
//        Pair playerPos = new Pair();
//        playerPos.setRow_index(3);
//        playerPos.setColumn_index(2);
//
//        Pair plant1Pos = new Pair();
//        plant1Pos.setRow_index(2);
//        plant1Pos.setColumn_index(3);
//
//        Pair plant2Pos = new Pair();
//        plant1Pos.setRow_index(4);
//        plant1Pos.setColumn_index(3);
//
//        return new GameModel(6,6,board,playerPos,plant1Pos,plant2Pos);
//    }

    public static GameModel barses(){

        int board[][] = {
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 4, 4, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 4, 4, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 2, 2, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 2, 2, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        Pair rock1=new Pair(17,14,-1,11);
        Pair rock2=new Pair(17,15,-1,11);
        Pair rock3=new Pair(16,14,-1,11);
        Pair rock4=new Pair(16,15,-1,11);

        Pair rock5=new Pair(1,14,-1,22);
        Pair rock6=new Pair(1,15,-1,22);
        Pair rock7=new Pair(2,14,-1,22);
        Pair rock8=new Pair(2,15,-1,22);


        return new GameModel(19,19,board,rock1,rock2,rock3,rock4,rock5,rock6,rock7,rock8);
    }


}
