package Logic;

import Controller.Actions;
//import Controller.MoveCheckAction;
import Models.GameModel;
import Models.Positions;

import java.util.ArrayList;
import java.util.Scanner;

public class UserPlay {

    private GameModel gameModel;

    public UserPlay(GameModel gameModel)
    {
        this.gameModel = gameModel;
        this.play();
    }

    public void play()
    {
        while(true)
        {
            // Select level ignored now

            Actions.printState(gameModel);

            if(Actions.isFinal(gameModel))
            {
                System.out.println("\n ============ GAME FINISHED ==============\n");
                return;
            }

            // رمي الاحجار
//            Throwingstones();

            // Print Moves Able Positions
            ArrayList<Positions> positions = Actions.CheckMoves(gameModel);

            for(var position : positions)
            {
                System.out.print("\t" + position);
            }
            System.out.println();

            char key = new Scanner(System.in).next().charAt(0);

            if(key == 'E')
            {
                System.out.println("\n ============ EXIT =============\n");
                return;
            }

            keyAction(key);
        }
    }

    private void keyAction(char keyChar)
    {
//        switch (keyChar)
//        {
//            case 'W':
//                if(MoveCheckAction.CheckUpMove(gameModel)||MoveCheckAction.CheckUpMoveP(gameModel))
//                    gameModel = Actions.Move(gameModel, Positions.UP);
//            break;
//
//            case 'S':
//                if(MoveCheckAction.CheckDownMove(gameModel)||MoveCheckAction.CheckDownMoveP(gameModel))
//                    gameModel = Actions.Move(gameModel, Positions.DOWN);
//                break;
//
//            case 'A':
//                if(MoveCheckAction.CheckLeftMove(gameModel)||MoveCheckAction.CheckLeftMoveP(gameModel))
//                    gameModel = Actions.Move(gameModel, Positions.LEFT);
//                break;
//
//            case 'D':
//                if(MoveCheckAction.CheckRightMove(gameModel)||MoveCheckAction.CheckRightMoveP(gameModel))
//                    gameModel = Actions.Move(gameModel, Positions.RIGHT);
//                break;
//        }
    }
}
