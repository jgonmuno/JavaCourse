package T7_polimorfismInterfaces.Automobiles;

public class Car extends Automobiles {

  public int gates;

  public Car(String brand, String model, String color, double power, double cc, int gates) {
    super(brand, model, color, power, cc);
    this.gates = gates;
  }

}
