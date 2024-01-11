package Logic;

import Controller.Actions;
import Models.GameModel;
import Models.State;

import java.util.ArrayList;

public class BaseLogic {
    ArrayList<State> VisitedList = new ArrayList<>();

    ArrayList<GameModel> solution = new ArrayList<>();

    public boolean isVisited(GameModel game)
    {

        for (State game1 : VisitedList)
        {
            if (Actions.Equals(game1.getValue(), game))
                return true;
        }
        return false;
    }



//    protected void Play()
//    {
//        while (true)
//        {
//            System.out.println("p: print states || q: quit\n");
//
//            char action = new Scanner(System.in).next().charAt(0);
//
//            switch (action)
//            {
//                case 'p':
//                    int moveNumber = 1;
//                    for (int i = solution.size() - 1; i >= 0; i--)
//                    {
//                        System.out.println("Move Number: " + moveNumber);
//
//                        Actions.printState(solution.get(i));
//                        System.out.println();
//
//                        moveNumber += 1;
//                    }
//
//                    System.out.println("Visited Nodes Count: " + visitedNodes.Count);
//                    System.out.println("Execution Time: " + timer.ElapsedMilliseconds + " ms");
//                    System.out.println("Solution Node Depth: " + solution.Count);
//
//                    break;
//                case 'q':
//                    System.out.println("Exiting ..");
//                    return;
//            }
//        }
//    }
}
