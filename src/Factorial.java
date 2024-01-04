import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose a number to know its factorial");
    int number = sc.nextInt();
    int factorial = 1;

    // Factorial Calculation
    for (int i = number; i > 0; i--) {
      factorial=factorial*i;
    }
    System.out.println("Factorial of " +number+ " is " +factorial);
  }
}
