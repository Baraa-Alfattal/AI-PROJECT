//package Controller;
//
//import Models.GameModel;
//
//public class MoveCheckAction {
//
//    public static boolean CheckLeftMove(GameModel game) {
//        // player row position index
//        int cell_row = game.getPlayer().getRow_index();
//
//        // player column position index
//        int cell_column = game.getPlayer().getColumn_index();
//
//        return cell_column - 1 >= 0 // check Left move array boundary
//                && game.getBoard()[cell_row][cell_column - 1] != 0
//                    &&game.getBoard()[cell_row][cell_column - 1] != 3; // check cell is not a block
//    }
//
//    public static boolean CheckLeftMoveP(GameModel game) {
//        // player row position index
//        int cell_row = game.getPlayer().getRow_index();
//
//        // player column position index
//        int cell_column = game.getPlayer().getColumn_index();
//
//        return  cell_column - 1 >= 0 &&
//                game.getBoard()[cell_row][cell_column - 1] == 3 // check Left move array boundary
//                && game.getBoard()[cell_row][cell_column - 2] != 3
//                && game.getBoard()[cell_row][cell_column - 2] != 0; // check cell is not a block
//    }
//
//    public static boolean CheckRightMove(GameModel game) {
//        // player row position index
//        int cell_row = game.getPlayer().getRow_index();
//
//        // player column position index
//        int cell_column = game.getPlayer().getColumn_index();
//
//        return cell_column + 1 < game.getColumn_boundary() // check Right move array boundary
//                && game.getBoard()[cell_row][cell_column + 1] != 0
//                    &&game.getBoard()[cell_row][cell_column + 1] != 3; // check cell is not a block
//    }
//
//    public static boolean CheckRightMoveP(GameModel game) {
//        // player row position index
//        int cell_row = game.getPlayer().getRow_index();
//
//        // player column position index
//        int cell_column = game.getPlayer().getColumn_index();
//
//        return  cell_column + 1 < game.getColumn_boundary()&&
//                game.getBoard()[cell_row][cell_column + 1] == 3 // check Right move array boundary
//                && game.getBoard()[cell_row][cell_column + 2] != 3
//                && game.getBoard()[cell_row][cell_column + 2] != 0; // check cell is not a block
//    }
//
//    public static boolean CheckUpMove(GameModel game) {
//        // player row position index
//        int cell_row = game.getPlayer().getRow_index();
//
//        // player column position index
//        int cell_column = game.getPlayer().getColumn_index();
//
//        return cell_row - 1 >= 0 // check Up move array boundary
//                && game.getBoard()[cell_row - 1][cell_column] != 0
//                    &&game.getBoard()[cell_row - 1][cell_column] != 3; // check cell is not a block
//    }
//
//    public static boolean CheckUpMoveP(GameModel game) {
//        // player row position index
//        int cell_row = game.getPlayer().getRow_index();
//
//        // player column position index
//        int cell_column = game.getPlayer().getColumn_index();
//
//        return  cell_row - 1 >= 0 &&
//                game.getBoard()[cell_row - 1][cell_column] == 3
//                &&  game.getBoard()[cell_row - 2][cell_column] != 3
//                && game.getBoard()[cell_row - 2][cell_column] != 0; // check cell is not a block
//    }
//
//    public static boolean CheckDownMove(GameModel game) {
//        // player row position index
//        int cell_row = game.getPlayer().getRow_index();
//
//        // player column position index
//        int cell_column = game.getPlayer().getColumn_index();
//
//        return cell_row + 1 < game.getColumn_boundary() // check Down move array boundary
//                && game.getBoard()[cell_row + 1][cell_column] != 0 // check cell is not a block
//                    &&game.getBoard()[cell_row + 1][cell_column] != 3;
//    }
//
//    public static boolean CheckDownMoveP(GameModel game) {
//        // player row position index
//        int cell_row = game.getPlayer().getRow_index();
//
//        // player column position index
//        int cell_column = game.getPlayer().getColumn_index();
//
//        return  cell_row + 1 < game.getColumn_boundary() &&
//                game.getBoard()[cell_row + 1][cell_column] == 3
//                && game.getBoard()[cell_row + 2][cell_column] != 3
//                    && game.getBoard()[cell_row + 2][cell_column] != 0; // check cell is not a block
//    }
//}
