package T7_polimorfismInterfaces.Figures;

public class Circle extends Figures implements Drawable{

  private double radio;

  public Circle(String color, double radio) {
    super(color);
    this.radio = radio;
  }

  @Override
  public double calculateArea(){
    return Math.PI * Math.pow(radio, 2);
  }

  void roll(){
    System.out.println("The circle "+color+"is rolling");
  }

  @Override
  public void draw() {
    System.out.println("Drawing a circle");
  }
}
