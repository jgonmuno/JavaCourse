public class ForExample {

  public static void main(String[] args) {

    for (int j = 0; j < 10; j++) {
      System.out.println("Imprimiendo tabla del " +j+"\n");
      for (int i = 0; i < 10; i++) {
        System.out.println(j+"x"+i+"="+(j*i) + "\n");
      }
    }
  }
}
