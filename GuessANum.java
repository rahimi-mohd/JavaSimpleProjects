import java.util.Random;
import java.util.Scanner;

public class GuessANum{
  public static void main(String[] args){
    //init scanner & random
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    // computer choice
    int computer = random.nextInt(20) + 1;
    // System.out.println(computer); to debug

    int life = 5;

    // main loop
    while(true){
      // user answer prompt
      System.out.println("Guess a number: ");
      int user = input.nextInt();

      // if statement
      if (user == computer){
        System.out.println("You got it! Computer choose " + computer);
        break;
      }
      else if (user > computer) {
        System.out.println("Too high!");
        life --;
        System.out.println("life : " + life);
      } // if life <= 0
       if (life <= 0){
        System.out.println("You lose ! Computer choose :" + computer);
        break;
      }
      else if (user < computer){
        System.out.println("Too low!");
        life--;
        System.out.println("Life : " + life);
      } // if life <=0
      if (life <= 0){
        System.out.println("You lose ! Computer choose :" + computer);
        break;
      }
    }

  }
}
