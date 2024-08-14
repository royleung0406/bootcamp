public class DemoWrapperClass {
  public static void main(String[] args) {
    int x = 10; // 10 is an int value, x is variable

    // Int = integer
    Integer i1 = 10; // i is an object reference
    Integer i2 = new Integer(10); // i2 -> obj ref, 10 is an object
    // Object reference stores object address

    double d1 = i2.doubleValue();

    System.out.println(i2.compareTo(11)); // -1

    String s = "hello"; //Java will create objective automatically
    String s2 = new String("Hello");

    // If you are going to compare number objects (Integer, Long, Short, Byte)
    Double d2 =new Double(3);
    System.out.println(d2.doubleValue()); // 3.0
    String str = d2.toString(); // "3.0"
    System.out.println(d2); //3.0

    // Short, Longm Byte
    Long l1 = new Long(34);
    Short s3 = i2.shortValue(); // Similiar to downcasting
    Byte b1 = i2.byteValue();

    int x6 = new Double(10.5).intValue(); // Precision loss
    System.out.println(x6);

    short s4 = new Double(40000.55).shortValue();
    System.out.println(s3); // Overflowed and Precision loss

    // char -> Character
    Character c = 'a'; // Auto-box , put a in to c in object
    Integer i5 =10; // Autobox // it calling new
    Boolean b2 = true;
    b2 = new Boolean("true");
    b2 = new Boolean(false);



    // 8 Primitive and 8 Wrapper and 1 String

    int[] arr = new int[] {2, 6 ,10};
    Integer[] arr2 = 
              new Integer[] {new Integer(2), new Integer(6), new Integer(10)};
    Integer[] arr3 = new Integer[] {2, 6 ,10};

    Integer g = 10;
    if(g.equals(new Integer(10))){

    }

    Integer[] integers = new Integer[] {10, 8, 4, -3, 7};
    // Find the number > 5
    int count = 0;
    for (int i = 0; i < integers.length; i++){
        if (integers[i].compareTo(new Integer(5)) > 0){
          count++;
        }
    } System.out.println(count);

    Character[] characters = new Character[] {'c', '9', '0', 'e', '!'};
    // Find the number of "Number" in the array
    //2
    count=0;
    for (int i = 0; i < characters.length; i++){
      if (characters[i].charValue() >= 48 && characters[i].charValue() <= 57){
        count++;
      }
    }
    System.out.println(count);

    int result = Integer.parseInt("10");
    System.out.println(result);
    // result = Integer.parseInt("hello"); // bug
    // System.out.println(result); // java.lang.NumberFormatException


  }
}
