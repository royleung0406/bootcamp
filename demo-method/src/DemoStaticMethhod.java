public class DemoStaticMethhod {
  public static void main(String[] args) {
    double radius1 = 1.3;
    System.out.println(radius1*radius1*3.14);
    double radius2 = 1.4;
    System.out.println(radius2*radius2*3.14);
    double radius3 = 1.5;
    System.out.println(radius3*radius3*3.14);

    // Approcah 2
    // bad, not business readable
    double[] radiusList = new double[] {1.3, 1.4, 1.5};
    for (int i = 0; i < radiusList.length; i++){
      System.out.println(radiusList[i] * radiusList[i] * 3.14);
    }

    // Approcah 3
    // bad, not business readable
    double[] radiusList2 = new double[] {1.3, 1.4, 1.5};
    double totalArea = 0.0;
    for (int i = 0; i < radiusList2.length; i++){
      totalArea += calculateAreaForCircle(radiusList2[i]);
    }
    System.out.println(totalArea);



    String encrypted =  encrypt("null");
    System.out.println(encrypted);
    System.out.println(sum(1, 2));
    System.out.println(sum(1.3, 2.5));
    System.out.println(sum(1L, 2L));
    System.out.println(sum((byte) 1, (byte) 2));
    System.out.println(sum(1f, 2f)); // (float float to int)

print(5,6); // sysout
calculateAreaForSquare(3);
}


  // input String -> output String
  // input String, String -> output Integer
    public static String encrypt (String password) {
      char[] characters = password.toCharArray();
      String encrypted = "";
      for (int i = 0; i < characters.length; i++){
        encrypted += (char) ((characters[i] + 3) * 2);
      }
      return encrypted;
    }

    public static String decrypt (String encrypted) {
      char[] characters = encrypted.toCharArray();
      String original = "";
      for (int i = 0; i < characters.length; i++){
        original += (char) ((characters[i] / 2) -3);
      }
      return original;
    }


  // If input is able to produce output, then it is static method
  // double java.lang.Math.pow(double a, double b)
  // Method name should start with verb
  public static double calculateAreaForCircle(double radius) {
    //return radius * radius * Math.PI;
    // pow(base, index) -> base ^ index
    return Math.pow(radius, 2.0) * Math.PI;
  }

  public static double calculateAreaForSquare(double length) {
    //return radius * radius * Math.PI;
    // pow(base, index) -> base ^ index
    return Math.pow(length, 2.0);
  }

  //Method Signature = Method Name + Numbeer of Parameters and Type of parameter
  public static int sum(int x, int y){
    System.out.println("Method : int sum(int x, int y)");
    return x + y;
  }
  public int sum(int x, int y, int z){
    System.out.println("Method : int sum(int x, int y, int z)");
    return x + y + z;
  }
  // Method Signature sum(double x, double y) != sum(int x, int y)

  public static int sum(double x, double y){
    System.out.println("Method : int sum(double x, double y)");
    return (int)(x + y);
  }
  // public static double sum(double x, double y ) it is parameter same problem

  // Return Ttpe : Primitives + Wrapper + String
  // void -> return nothing (No return keyword)
    public static void print(int x, int y){
      System.out.println("x=" + x);
      System.out.println("y=" + y);
    }
      
    }
