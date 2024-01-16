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

  public void breathe(){
    System.out.println("This animal can breathe");
  }

  public static void main(String[] args) {
    Pet puppy = new Pet();
    System.out.println(puppy instanceof Pet);
    System.out.println(puppy instanceof Object);
  }

}
