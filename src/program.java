import Logic.*;
import Models.GameModel;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        GameModel barses = GameLevel.barses();
        while (true) {

            System.out.println("game started");

            UserPlay userPlay2 = new UserPlay(barses);

//            char option = new Scanner(System.in).next().charAt(0);

        }
    }
}
