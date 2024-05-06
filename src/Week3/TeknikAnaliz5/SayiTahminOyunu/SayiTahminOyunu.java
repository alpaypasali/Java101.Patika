package Week3.TeknikAnaliz5.SayiTahminOyunu;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    private int guessedNumber;
    private int userGuess;
    private boolean gameRunning;
    private  int lives;
    private  int invalidGuessCount;

    public SayiTahminOyunu() {
        Random rand = new Random();
        guessedNumber = rand.nextInt(101);
        lives = 5;
        invalidGuessCount = 0;
        gameRunning = true;
    }
    public void takeUserGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tahmininizi girin (0 ile 100 arasında): ");
        userGuess = scanner.nextInt();
    }
    public void checkGuess() {

      if(checkInvalidNumber())
          return;

        checkAnswer();


        getRemainingLives();

    }
    public boolean isGameRunning() {
        return gameRunning;
    }
    public void checkAnswer(){

        if (userGuess < guessedNumber) {
            System.out.println("Daha yüksek bir sayı girin..");
        } else if (userGuess > guessedNumber) {
            System.out.println("Daha düşük bir sayı girin..");
        } else {
            System.out.println("Tebrikler! Doğru tahmin ettiniz.");
            gameRunning = false;
            return;
        }
    }
    public void getRemainingLives(){
        lives--;
        if (lives == 0) {
            System.out.println("Kaybettiniz ! ---- Doğru sayı : " + guessedNumber);
            gameRunning = false;
        } else {
            System.out.println("Kalan can - " + lives );
        }
    }
    public boolean checkInvalidNumber(){
        if (userGuess < 0 || userGuess > 100) {
            System.out.println("Lütfen 0 ile 100 arasında bir sayı girin.");
            invalidGuessCount++;
            if(invalidGuessCount >= 2){
                getRemainingLives();

            }
            return true;
        }
        return false;

    }

}
