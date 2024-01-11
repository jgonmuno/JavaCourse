package T5_POO.Pet;

public class Dog extends Pet {

  String race;

  public Dog(String name, int age, String color, String race) {
    super(name, age, color);
    this.race = race;
  }


  void printInformation(){
    System.out.println("My friend has a dog named " +name+ " aged " +age+ " of " +race+ " race");
  }

  public static void main(String[] args) {
    Dog letiDog = new Dog("Pancho", 11, "White", "Labrador");
    letiDog.printInformation();
    Dog anaDog = new Dog("Nera", 7, "Black", "Malinois");
    Dog angelDog = new Dog ("Calcetines", 2, "White", "Chihuahua");
  }

}
