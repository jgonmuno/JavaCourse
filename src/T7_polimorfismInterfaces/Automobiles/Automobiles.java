package T7_polimorfismInterfaces.Automobiles;

public class Automobiles {

  public String brand;
  public String model;
  public String color;
  public double power;
  public double cc;

  public Automobiles(String brand, String model, String color, double power, double cc) {
    this.brand = brand;
    this.model = model;
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

  public double getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public double getCc() {
    return cc;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}
