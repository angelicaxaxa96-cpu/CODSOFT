import java.util.Scanner;
import java.util.Random;

public class NumberGame {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rando = new Random();

    char playAgain;
    int score = 0;
    int attempts = 5;

    do {
      int number = rando.nextInt(100);
      boolean guessed = false;

      System.out.println(number);
      while (attempts > 0) {
        System.out.println("Enter the guess:");
        int guess = sc.nextInt();

        if (guess == number) {
          System.out.println("Congratulation! You win");
          score += 5;
          guessed = true;
          break;
        } else if (guess > number) {
          System.out.println("Too High!");
        } else if (guess < number) {
          System.out.println("Too Low!");
        }
        attempts--;
        System.out.println("Attempts left:" + attempts + " " + "Current Points:" + score);
      }
      if (!guessed)
        System.out.println("Oops! You Lost Number was:" + number);
      score = (score - (5 - attempts));

      System.out.println("Play Again? (Y/N): ");
      playAgain = sc.next().charAt(0);
    } while (playAgain == 'Y' || playAgain == 'y');

    System.out.println("Final Score:" + score);
  }
}
