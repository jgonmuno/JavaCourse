package T10_threads;

public class ExecutableExample implements Runnable{

  public int amount = 0;
  public static void main(String[] args) {

  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      amount ++;
      System.out.println(amount);
    }
  }
}
