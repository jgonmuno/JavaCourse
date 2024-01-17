package T5_POO.modifiers;

public class ExampleProtectedTest extends ExampleProtected {
    protected void bar(){
      foo();
    }

    public static void main(String[] args) {
      ExampleProtectedTest protectedTest = new ExampleProtectedTest();
      protectedTest.bar();
  }
}
