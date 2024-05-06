package Week3.TeknikAnaliz5.SayiTahminOyunu;

public class Main {
    public static void main(String[] args) {
        SayiTahminOyunu game = new SayiTahminOyunu();
        while (game.isGameRunning()) {
            game.takeUserGuess();
            game.checkGuess();
        }


    }
}
