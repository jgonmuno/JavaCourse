package T7_polimorfism;

public class Square extends Figures{

  private double side;

  public Square(String color, double side) {
    super(color);
    this.side = side;
  }

  @Override
  public double calculateArea(){
    return side * side;
  }
}
