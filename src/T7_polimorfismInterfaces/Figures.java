package T7_polimorfismInterfaces;

public abstract class Figures {

  public String color;

  public Figures(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public abstract double calculateArea();
}
