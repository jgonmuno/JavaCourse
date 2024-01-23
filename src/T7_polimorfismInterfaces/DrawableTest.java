package T7_polimorfismInterfaces;

public class DrawableTest {

  void draw (Drawable drawable){
    drawable.draw();
  }

  public static void main(String[] args) {
    DrawableTest test = new DrawableTest();
    test.draw(new Circle("red", 13.10));
    test.draw(new Rectangle("green", 8.00, 4.00));

    System.out.println(new Circle("brown", 8.8) instanceof Drawable);
  }


}
