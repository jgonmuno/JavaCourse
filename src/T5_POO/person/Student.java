package T5_POO.person;

public class Student extends Person{

  int accountNumber;

  Student(int accountNumber, String name, String birthDate){
    super(name, birthDate);
    this.accountNumber=accountNumber;
  }

  public void pass(){
    System.out.println("I am " +name+ " and my exam mark is above 5, that means I have passed the exam");
  }

  public void fail(){
    System.out.println("I am " +name+ " and my exam mark is under 5, that means I have failed the exam");
  }

}
