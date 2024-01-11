package Controller;

import Models.GameModel;
import Models.Positions;

import java.util.ArrayList;

public class Actions {

    // Get Moves Able Positions
    public static ArrayList<Positions> CheckMoves(GameModel game)
    {
        ArrayList<Positions> data = new ArrayList<>();

//        if(MoveCheckAction.CheckUpMove(game)||MoveCheckAction.CheckUpMoveP(game)) {
//            data.add(Positions.UP);
//        }
//
//        if(MoveCheckAction.CheckDownMove(game)||MoveCheckAction.CheckDownMoveP(game))
//            data.add(Positions.DOWN);
//
//        if(MoveCheckAction.CheckLeftMove(game)||MoveCheckAction.CheckLeftMoveP(game))
//            data.add(Positions.LEFT);
//
//        if(MoveCheckAction.CheckRightMove(game)||MoveCheckAction.CheckRightMoveP(game))
//            data.add(Positions.RIGHT);

        return data;
    }

//    public static GameModel Move(GameModel game,  Positions newPosition) {
//        switch (newPosition) {
//            case UP:
//                return MoveOnAction.MoveUp(game);
//            case DOWN:
//                return MoveOnAction.MoveDown(game);
//            case LEFT:
//                return MoveOnAction.MoveLeft(game);
//            default:
//                return MoveOnAction.MoveRight(game);
//        }
//    }

    public static ArrayList<GameModel> GetNextStates(GameModel gameModel)
    {
        ArrayList<GameModel> nextStates = new ArrayList<>(); // Store States

        ArrayList<Positions> moves = CheckMoves(gameModel); // Get All Move able positions

        // Move to all positions
//        for(var movePosition : moves)
//        {
//            nextStates.add(Move(gameModel,movePosition));
//        }


        return nextStates;
    }

    public static boolean isFinal(GameModel game) {


        int [][] g = game.getBoard();


                if(game.getRow_boundary() == 6 && g[2][4]==3 && g[4][4]==3) // if there is at least one white
                {
                        return true;
                }
                else if (game.getRow_boundary()==7 && g[4][3]==3 && g[4][4]==3) {
                        return true;
                }

        return false;

    }

    public static boolean Equals(GameModel game1, GameModel game2) {
        return game1.equals(game2);
    }

    // Print Game Board
    public static void printState(GameModel game)
    {
        int[][] board = game.getBoard();

//        System.out.println("Move to: " + game.getLastPosition().name());

        for (int i = 0; i < game.getRow_boundary(); i++)
        {

            for (int j = 0; j < game.getColumn_boundary(); j++)
            {
                 if (board[i][j] == 1)
                    System.out.print(" | | ");

                else if (board[i][j] == 2)
                    System.out.print("*");

                else if(board[i][j]== 4)
                    System.out.print("&");
                else
                    System.out.print("     ");
            }
            System.out.println();
        }
        System.out.println("\n");
//        System.out.println("Player Position At Cell(" + game.getPlayer().getRow_index() + "," + game.getPlayer().getColumn_index()+")\n");
    }
}
