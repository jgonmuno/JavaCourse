package T7_polimorfismInterfaces.Automobiles;

public class Truck extends Automobiles {

  public double chargeCapacity;

  public Truck(String color, int power, int cc, double chargeCapacity) {
    super(color, power, cc);
    this.chargeCapacity = chargeCapacity;
  }
}
