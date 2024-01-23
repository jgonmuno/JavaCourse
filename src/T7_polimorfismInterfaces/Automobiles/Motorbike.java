package T7_polimorfismInterfaces.Automobiles;

public class Motorbike extends Automobiles{

  public String category;

  public Motorbike(String brand, String model, String color, double power, double cc,
      String category) {
    super(brand, model, color, power, cc);
    this.category = category;
  }
}
