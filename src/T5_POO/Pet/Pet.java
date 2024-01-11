package T5_POO.Pet;

public class Pet {

  String name;
  int age;
  String color;

  public Pet() {
    System.out.println("Default constructor");
  }

  public Pet (String name, int age, String color){
    this.name = name;
    this.age = age;
    this.color = color;
  }

}
