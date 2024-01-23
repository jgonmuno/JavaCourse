package T7_polimorfismInterfaces.Automobiles;

public class Automobiles {

  public String color;
  public String power;
  public String cc;

  public Automobiles(String color, String power, String cc) {
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

  public String getPower() {
    return power;
  }

  public void setPower(String power) {
    this.power = power;
  }

  public String getCc() {
    return cc;
  }

  public void setCc(String cc) {
    this.cc = cc;
  }
}
