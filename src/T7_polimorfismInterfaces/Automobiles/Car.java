package T7_polimorfismInterfaces.Automobiles;

public class Car extends Automobiles {

  public int gates;

  public Car(String color, int power, int cc, int gates) {
    super(color, power, cc);
    this.gates = gates;
  }

  Car fordFocus = new Car("red", 1600, 115, 3);


}
