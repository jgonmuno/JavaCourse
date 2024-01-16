package T5_POO;

public class Person {

  String name;
  int age;
  String gender;

  Person(){
    this("defaultName", 30, "Female");
    System.out.println("Default constructor");
  }

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  void playVideogames(Person person){
    System.out.println(name+ " is playing with " +person.name);
  }

  void printInformation(){
    System.out.println("Name: " +name);
    System.out.println("Age: " +age);
    System.out.println("Gender: " +gender);
  }


  public static void main(String[] args) {
    Person person1 = new Person("Jesus", 33, "Male");
    person1.printInformation();

    Person person2 = new Person("Fernando", 32, "Male");
    person2.printInformation();

    person1.playVideogames(person2);

    new Person().printInformation();
  }

}
