import java.util.Scanner;

public class TriangleFor {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce number of rows");
    int rows = sc.nextInt();

    for (int i = 0; i < rows; ++i) {
      System.out.println();
      for (int j = 0; j <= i; ++j) {
        System.out.print('*');
      }
    }
  }
}
