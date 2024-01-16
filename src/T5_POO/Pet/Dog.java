package T5_POO.Pet;

public class Dog extends Pet {

  String race;
  String owner;

  public Dog(String name, int age, String color, String race, String owner) {
    super(name, age, color);
    this.race = race;
    this.owner = owner;
  }


  void printInformation(){
    System.out.println("My friend "+owner+" has a dog named " +name+ " aged " +age+ " of " +race+ " race");
  }

  public static void main(String[] args) {
    Dog letiDog = new Dog("Pancho", 11, "White", "Labrador", "Leticia");
    letiDog.printInformation();
    letiDog.breathe();
    System.out.println(letiDog instanceof Pet);

    Dog anaDog = new Dog("Nera", 7, "Black", "Malinois", "Ana");
    anaDog.printInformation();

    Dog angelDog = new Dog ("Calcetines", 2, "White", "Chihuahua", "Angel");
    angelDog.printInformation();

    Dog juanfranDog = new Dog("Atila", 8, "Black", "German shepherd", "Juanfran");
    juanfranDog.printInformation();

    Dog javiDog = new Dog("Pepe", 5, "White", "Dogo", "Javier");
    javiDog.printInformation();

    Dog fernandoDog = new Dog("Cristiano", 6, "White", "Carlino", "Fernando");
    fernandoDog.printInformation();

  }

}
