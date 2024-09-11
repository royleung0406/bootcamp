// !!!! Once the class extends "Exception.class", this class becomes Checked
// Exception class
public class Trial extends Exception {

  public static void main(String[] args) {
    Trial be = new Trial();

    try {
      calculate(1, 1); // unhandled checked exception
    } catch (Trial e) {

    }
    System.out.println(be);
  }

  public static int calculate(int x, int y) throws Trial {
    if (x + y <= 20)
      return x + y;
    throw new Trial();
  }
}