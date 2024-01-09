package T5_POO;

public class Person {

  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Jesus";
    person1.age = 33;
    person1.gender = "Male";
    person1.printInformation();

    Person person2 = new Person();
    person2.name = "Fernando";
    person2.age = 32;
    person2.gender = "Male";
    person2.printInformation();
  }

  String name;
  int age;
  String gender;

  void printInformation(){
    System.out.println("Name: " +name);
    System.out.println("Age: " +age);
    System.out.println("Gender: " +gender);
  }

}
