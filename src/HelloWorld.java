public class HelloWorld {

  public static void main(String[] args) {
    String salutation = "Hi there! My name is Jesus";
    System.out.println(salutation);
    System.out.println(salutation.toUpperCase());

    int number = 10;
    System.out.println(number);
    boolean valor = true;

    if(valor){
      number = 5;
      System.out.println("The new value of the number is " +number);
    }

    String name;
    if(number>10){
      name = "Alfredo";
    }
  }
}
