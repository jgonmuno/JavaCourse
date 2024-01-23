package T7_polimorfismInterfaces.Automobiles;

public class Automobiles {

  public String color;
  public int power;
  public int cc;

  public Automobiles(String color, int power, int cc) {
    this.color = color;
    this.power = power;
    this.cc = cc;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public int getCc() {
    return cc;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }
}
