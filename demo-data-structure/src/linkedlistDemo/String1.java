package linkedlistDemo;

public class String1 {
  private String1 string;

  public String1() {

  }

  public String1(String1 string) {

  }

  public static void main(String[] args) {
    String1 stringList = new String1(new String1());
    String1 stringList2 = new String1(new String1(new String1()));
    String1 stringList3 = new String1(new String1(new String1(new String1())));
  }
}