import java.util.*;

class Game {
    public int num;
    public int userNumber;
    public int noOfGuess = 0;

    public int getNoOfGuess() {
        return noOfGuess;
    }

    public void setNoOfGuess(int g) {
        this.noOfGuess = g;
    }

    Game() {
        Random r = new Random();
        this.num = r.nextInt(100);
    }

    void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number: ");
        userNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuess++;
        if (num == userNumber) {
            System.out.format("You guessed it right, it is %d\nYou guessed it in %d attempts\n",num,noOfGuess);
            return true;
        }
        else if(num<userNumber) {
            System.out.println("Too high....");
        }
        else if(num>userNumber) {
            System.out.println("Too low....");
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        boolean b=false;
        while(!b) {
            game.takeUserInput();
            b = game.isCorrectNumber();
        }
    }
}