package T5_POO.person;

public abstract class Person {

  String name;
  String birthDate;

  Person(String name, String birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }

  void printInformation(){
    System.out.println("Name: " +name);
    System.out.println("birthDate: " +birthDate);
  }

  void eat() {
      System.out.println("I am " +name+ " and I eat 3 times per day");
  }

  void sleep(){
    System.out.println("I am " +name+ "and I can sleep since " +birthDate);
  }

  void breathe(){
    System.out.println("I am " +name+ "and I can breathe");
  }
}
