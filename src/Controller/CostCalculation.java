package Controller;

import Models.GameModel;
import Models.Pair;

public class CostCalculation {

    public static int cpCalc1(GameModel gameModel)
    {
        int result = 0;

////        Pair Player2Plant2 = gameModel.getPlayer().sub(gameModel.getPlant2());
////        Pair Player2Plant1 = gameModel.getPlayer().sub(gameModel.getPlant1());
//
//        if(Player2Plant1.lessthan(Player2Plant2)){
//
//        }

        for (int i=0; i<gameModel.getRow_boundary(); i++)
        {
            for (int j = 0; j < gameModel.getColumn_boundary(); j++)
            {
                if (gameModel.getBoard()[i][j] == 1)
                    result += 1;
            }
        }

        return result;
    }


}
