package T9_staticReferences;

public class staticExample {

  public static void main(String[] args) {
    new Human();
    new Human();
    System.out.println(Human.humansNumber);
  }

}
