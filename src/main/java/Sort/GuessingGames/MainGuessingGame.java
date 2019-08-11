package Sort.GuessingGames;

import java.util.Random;
import java.util.Scanner;

public class MainGuessingGame {

    public static final int upperBound = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int randNumber = random.nextInt(upperBound);
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 7; ++i){
            int playerNumber = scanner.nextInt();
            if (playerNumber == randNumber){
                System.out.println("Win!");
                return;
            }
            if (playerNumber < randNumber) {
                System.out.println("Za malo");}
                else
                System.out.println("Za duzo");
            }
            System.out.println();
        }

    }

