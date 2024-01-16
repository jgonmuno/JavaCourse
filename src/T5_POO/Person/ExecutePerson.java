package T5_POO.Person;

public class ExecutePerson {

  public static void main(String[] args) {

    Student student1 = new Student(1234567, "Pablo", "10/12/2002");
    student1.sleep();
    student1.pass();
    student1.fail();
    student1.breathe();

    Employee e = new Employee(168, 7.5, "Fulgencio Cifuentes", "11/01/1973");
    e.printTimetableAndSalary();

    Employee specialist = new Employee (160, 10, "Alan Turing", "21/12/1981");
    specialist.printTimetableAndSalary();
  }
}
