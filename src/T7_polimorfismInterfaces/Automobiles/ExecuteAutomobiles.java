package T7_polimorfismInterfaces.Automobiles;

public class ExecuteAutomobiles {

  void printInfo(Automobiles automobile){
    System.out.println("The color of the automobile is " +automobile.getColor()+ " and its power " +automobile.getPower()+ " and cc " +automobile.getCc());
  }

  public static void main(String[] args) {

    Car seatCordoba = new Car("Seat", "Cordoba","white", 60, 1400, 5);
    Truck pegaso = new Truck("Pegaso", "Troner", "white", 500, 3500, 2000);
    Van citan = new Van("Mercedes", "Citan", "black", 150, 2000, 7, 500);
    Motorbike ninja = new Motorbike("Kawasaki", "Ninja", "green", 70, 650, "Sport touring");

    ExecuteAutomobiles executeAutomobiles = new ExecuteAutomobiles();
    executeAutomobiles.printInfo(seatCordoba);
    executeAutomobiles.printInfo(pegaso);
    executeAutomobiles.printInfo(citan);
    executeAutomobiles.printInfo(ninja);

  }

}
