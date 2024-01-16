package T5_POO.Person;

public class Employee extends Person {

  double salary;
  double monthlyhHours;

  double salaryPerHour;

  Employee(double monthlyhHours, double salaryPerHour, String name, String birthDate){
    super(name, birthDate);
    this.monthlyhHours = monthlyhHours;
    this.salaryPerHour = salaryPerHour;
  }

  double calculateTotalSalary(){
    salary = salaryPerHour * monthlyhHours;
    return salary;
  }

 void printTimetableAndSalary(){
    System.out.println("The employee " +name+ " works " +monthlyhHours+ " hours per month and its total salary per month is " +calculateTotalSalary());
 }

}
