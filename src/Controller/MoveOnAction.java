//package Controller;
//
//import Models.GameModel;
//import Models.Positions;
//
//public class MoveOnAction {
//
//    public static GameModel MoveUp(GameModel game) {
//
//        GameModel gameCopy = new GameModel(game);
//
//        int[][] board = gameCopy.getBoard();
//
//        int row_index = gameCopy.getPlayer().getRow_index() - 1;
//        int column_index = gameCopy.getPlayer().getColumn_index();
//
//        if(board[row_index][column_index]==3){
//
//            // change player coordinates
//            if((row_index==gameCopy.getPlant1().getRow_index())&&(column_index==gameCopy.getPlant1().getColumn_index())) {
//                gameCopy.getPlant1().setRow_index(row_index - 1);
//            }
//            else {
//                gameCopy.getPlant2().setRow_index(row_index - 1);
//            }
//
//            board[row_index-1][column_index] = 3;
//        }
//        board[row_index][column_index] = 2;
//        board[row_index+1][column_index] = 1;
//
//        gameCopy.getPlayer().setRow_index(row_index);
//
//        gameCopy.setLastPosition(Positions.UP);
//        return gameCopy;
//    }
//
//    public static GameModel MoveDown(GameModel game) {
//
//        GameModel gameCopy = new GameModel(game);
//
//        int[][] board = gameCopy.getBoard();
//
//        int row_index = gameCopy.getPlayer().getRow_index() + 1;
//        int column_index = gameCopy.getPlayer().getColumn_index();
//
//        if(board[row_index][column_index]==3){
//
//            // change player coordinates
//            if((row_index==gameCopy.getPlant1().getRow_index())&&(column_index==gameCopy.getPlant1().getColumn_index())) {
//                gameCopy.getPlant1().setRow_index(row_index + 1);
//            }
//            else {
//                gameCopy.getPlant2().setRow_index(row_index + 1);
//            }
//
//            board[row_index+1][column_index] = 3;
//        }
//
//            board[row_index][column_index] = 2;
//            board[row_index-1][column_index] = 1;
//
//            gameCopy.getPlayer().setRow_index(row_index);
//
//            gameCopy.setLastPosition(Positions.DOWN);
//
//
//        return gameCopy;
//    }
//
//    public static GameModel MoveLeft(GameModel game) {
//
//        GameModel gameCopy = new GameModel(game);
//
//        int[][] board = gameCopy.getBoard();
//
//        // new position cell
//        int row_index = gameCopy.getPlayer().getRow_index();
//        int column_index = gameCopy.getPlayer().getColumn_index() - 1;
//
//        if(board[row_index][column_index]==3){
//
//            // change player coordinates
//            if((row_index==gameCopy.getPlant1().getRow_index())&&(column_index==gameCopy.getPlant1().getColumn_index())) {
//                gameCopy.getPlant1().setColumn_index(column_index - 1);
//            }
//            else {
//                gameCopy.getPlant2().setColumn_index(column_index - 1);
//            }
//
//            board[row_index][column_index-1] = 3;
//        }
//        board[row_index][column_index] = 2;
//        board[row_index][column_index+1] = 1;
//
//        // change player coordinates
//        gameCopy.getPlayer().setColumn_index(column_index);
//
//        gameCopy.setLastPosition(Positions.LEFT);
//
//        // invert new position state (white to red & red to white)
//
//
//        return gameCopy;
//    }
//
//    public static GameModel MoveRight(GameModel game) {
//
//        GameModel gameCopy = new GameModel(game);
//
//        int[][] board = gameCopy.getBoard();
//
//        // new position cell
//        int row_index = gameCopy.getPlayer().getRow_index();
//        int column_index = gameCopy.getPlayer().getColumn_index() + 1;
//
//        if(board[row_index][column_index]==3){
//
//            // change player coordinates
//            if((row_index==gameCopy.getPlant1().getRow_index())&&(column_index==gameCopy.getPlant1().getColumn_index())) {
//                gameCopy.getPlant1().setColumn_index(column_index + 1);
//            }
//            else {
//                gameCopy.getPlant2().setColumn_index(column_index + 1);
//            }
//
//            board[row_index][column_index+1] = 3;
//        }
//        board[row_index][column_index] = 2;
//        board[row_index][column_index-1] = 1;
//
//        // change player coordinates
//        gameCopy.getPlayer().setColumn_index(column_index);
//
//        gameCopy.setLastPosition(Positions.RIGHT);
//
//        return gameCopy;
//    }
//}
