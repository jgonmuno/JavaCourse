package T5_POO.pet;

public class Cat extends Pet {

  String eyes;
  String species;

  public Cat(String name, int age, String color, String species, String eyes){
    super(name, age, color);
    this.species = species;
    this.eyes = eyes;
  }

  void printInformation(){
    System.out.println("My friend has a cat named " +name + " aged " +age+ " of " +species+ " species with " +eyes+ " eyes");
  }

  public static void main(String[] args) {
    Cat seteCat=new Cat("Elfa", 3, "black", "angora", "green");
    seteCat.printInformation();
    seteCat.breathe();
  }


}
