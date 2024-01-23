package T7_polimorfismInterfaces.Automobiles;

public class Truck extends Automobiles {

  public double chargeCapacity;

  public Truck(String brand, String model, String color, int power, int cc, double chargeCapacity) {
    super(brand, model, color, power, cc);
    this.chargeCapacity = chargeCapacity;
  }
}
