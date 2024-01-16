package T5_POO.Person;

public class ExecutePerson {

  public static void main(String[] args) {

    Student student1 = new Student(1234567, "Pablo", "10/12/2002");
    student1.sleep();
    student1.pass();
    student1.fail();
  }
}
