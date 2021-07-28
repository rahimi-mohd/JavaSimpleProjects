import java.util.Scanner;

public class Calc{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double sum;
    //promt two number
    System.out.println("Enter two numbers: ");
    double x = input.nextInt();
    double y = input.nextInt();
    input.nextLine(); // idk y i have to code this but it is what it is
    // prompt operation
    System.out.println("Enter operator, + for additional, - for subtraction, * for multiplication and / for subtraction: ");
    String operator = input.nextLine();

    // switch
    switch (operator){
      // additional
      case "+": sum = x + y;
      System.out.println("> " + sum);
      break;
      // subtraction
      case "-": sum = x - y;
      System.out.println("> " + sum);
      break;
      // multiplication
      case "*": sum = x * y;
      System.out.println("> " + sum);
      break;
      // division
      case "/": sum = x / y;
      System.out.println("> " + sum);
      break;
      // default
      default:
      System.out.println("Operator not found");
    }
  }
}
