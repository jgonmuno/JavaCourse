package T7_polimorfismInterfaces.Figures;

public class Rectangle extends Figures implements Drawable{

  private double base;
  private double height;

  public Rectangle(String color, double base, double height) {
    super(color);
    this.base = base;
    this.height = height;
  }

  @Override
  public double calculateArea(){
    return base * height;
  }

  @Override
  public void draw() {

  }
}
