public class DemoIf {
  public static void main(String[] args) {
    int x = 30;

    if (x >= 30) {
      System.out.println("x >= 30"); // print
    } else {
      System.out.println("x < 30");
    }

    boolean isXLargerThan30 = x >= 30; // true

    if (isXLargerThan30) {
      System.out.println("x >= 30"); // print
    } else {
      System.out.println("x < 30");
    }

    // 8 primitives, String (equals(), charAt(), length())


  }
}