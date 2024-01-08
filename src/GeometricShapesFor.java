import java.util.Scanner;

public class GeometricShapesFor {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rectangleRows;
    int baseAsterisks;
    int pyramidRows;

    try {
      System.out.println("Introduce number of rows of the rectangle");
      rectangleRows = sc.nextInt();
      printRectangle(rectangleRows);

      System.out.println("Introduce number of base Asterisks");
      baseAsterisks = sc.nextInt();
      printTriangle(baseAsterisks);

      System.out.println("Introduce number of rows of the pyramid");
      pyramidRows = sc.nextInt();
      printPyramid(pyramidRows);
    } catch (Exception e) {
      System.out.println("ERROR: Introduce integer type.");
    }


  }

  private static void printRectangle(int rows) {
    System.out.println("PRINTING RECTANGLE WITH " +rows+ " rows");
    for (int i = 0; i < rows; i++) {
      System.out.println("");
      for (int j = 0; j < rows; j++) {
        System.out.print("*");
      }

    }
    System.out.println("\n");
  }

  private static void printTriangle (int base){
    System.out.println("PRINTING TRIANGLE WITH BASE OF " +base+ " asterisks");
    for (int i = 0; i < base; i++) {
      System.out.println("");
      for (int j = 0; j <= i ; j++) {
        System.out.print("*");
      }
    }
    System.out.println("\n");
  }

  private static void printPyramid (int rows){
    System.out.println("PRINTING PYRAMID WITH " +rows+ " rows");
    System.out.println();
    for (int height = 1; height <= rows; height++) {
      for (int blank = 1; blank <= rows-height; blank++) {
        System.out.print(" ");
      }
        for (int asterisks = 1; asterisks <=(height*2)-1 ; asterisks++) {
          System.out.print("*");
        }
      System.out.println();
    }
  }
}
