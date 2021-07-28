import java.util.Scanner;

public class BmiCalc{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double weight, height, bmi;

    System.out.println("Enter your height(M): ");
    height = input.nextDouble();
    System.out.println("Enter your weight(KG): ");
    weight = input.nextDouble();

    bmi = weight / (height * height);

    System.out.println("Your bmi is :" + bmi);

    if (bmi < 18.5){
      System.out.println("You're underweight.");
    }
    else if (bmi >= 30){
      System.out.println("You have achieve the art of obesity.");
    }
    else if (bmi >= 25){
      System.out.println("You're overweight.");
    }
    else {
      System.out.println("You have normal weight.");
    }
  }
}
