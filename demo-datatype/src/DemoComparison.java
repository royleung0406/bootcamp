public class DemoComparison {
  public static void main(String[] args) {
    // >, <, >=, <=
    System.out.println(3 >= 2 ); // true
    int x = 10;
    int y = 11;
    boolean IsYLargerThanX = y > x;
    System.out.println(IsYLargerThanX); // true 

    System.out.println(x + 3 < y +2); // false
    boolean result = x +3 < y + 2; //false

    // ==, != (compare a and b)
    // Single = is Assignment
    int x2 = 3;
    System.out.println(x2 == 3); // true
    System.out.println(x2 == 4); // false
    System.out.println(x2 != 3); //false
    System.out.println(x2 != 4); // true

    double d1 = 10.4;
    System.out.println(d1 <= 10.4); // true
    //same as int, support all basic operators

    // More than 1 event
    int j1 = 10;
    int j2 = 12;
    System.out.println(j1 > j2); // false
    // And (&&) OR (||)
    System.out.println(j1 > j2 || j1 < 11); // false || true -> true (either one true = true)
    System.out.println(j1 > j2 && j1 < 11); // false && true -> false (All must be true sin true)

    System.out.println(true && true); // true
    System.out.println(true && false);//false
    System.out.println(true || false); // true
    System.out.println(false || false); // false 

    

  }
}
