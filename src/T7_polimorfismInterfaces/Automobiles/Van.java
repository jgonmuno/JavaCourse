package T7_polimorfismInterfaces.Automobiles;

public class Van extends Automobiles {

  public int seats;
  public double chargeCapacity;

  public Van(String brand, String model, String color, int power, int cc, int seats, double chargeCapacity) {
    super(brand, model, color, power, cc);
    this.seats = seats;
    this.chargeCapacity = chargeCapacity;
  }
}
