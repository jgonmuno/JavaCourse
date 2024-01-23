package T7_polimorfismInterfaces.Figures;

public class FiguresTest {

  void printArea (Figures figure){
    System.out.println("The color of the figure is " +figure.getColor()+ " and its area of " +figure.calculateArea());
  }

  public static void main(String[] args) {
    FiguresTest figuresTest = new FiguresTest();
    figuresTest.printArea(new Circle("Red", 4.0));
    figuresTest.printArea(new Square("Blue", 8.0));
    figuresTest.printArea(new Rectangle("Black", 3.3, 2.8));
  }

}
