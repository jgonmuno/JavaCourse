package T10_threads;

public class Main {

  public static void main(String[] args) {
    ExecutableExample executableExample1 = new ExecutableExample();
    Thread thread1 = new Thread(executableExample1);
    thread1.start();
    while (thread1.isAlive()){
      System.out.println("Waiting...");
    }
  }

}
