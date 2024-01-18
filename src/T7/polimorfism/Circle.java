package T7.polimorfism;

public class Circle extends Figures{

  private double radio;

  public Circle(String color, double radio) {
    super(color);
    this.radio = radio;
  }

  @Override
  public double calculateArea(){
    return Math.PI * Math.pow(radio, 2);
  }
}
