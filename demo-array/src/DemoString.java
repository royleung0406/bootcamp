import java.util.Arrays;

public class DemoString {
  public static void main(String[] args) {
    // isEmpty() vs isBlank()
    String s1 = "hello";
    System.out.println(s1.isEmpty()); //false
    System.out.println(s1.isBlank()); //false

    String s2 = "";
    System.out.println(s2.isEmpty()); // true
    System.out.println(s2.isBlank()); // true

    String s3 = " ";
    System.out.println(s3.isBlank()); // True
    System.out.println(s3.isEmpty()); //False

    String s4 = " hello";
    System.out.println(s4.isEmpty()); //false
    System.out.println(s4.isBlank()); //false

    String s5 = "HELLO";
    System.out.println(s5.toLowerCase()); // hello
    System.out.println(s5); // HELLO
    
    // indexOf
    s5.indexOf('e');// -1 case sensitive
    s5.indexOf('E'); //1
    s5.indexOf('E', 1); // 1
    s5.indexOf('E', 3); // -1
    s5. indexOf("LL", 2);// 2
    s5.indexOf("LL", 3); //-1

    // lastIndexof()
      System.out.println(s5.lastIndexOf('L')); //3
      System.out.println(s5.lastIndexOf("LL"));//5 

      // = , +=
      // concat()
      String s6 = "hello";
      s6 = s6 + "!!!";

      String s7 = " hello";
      s7 += "!!!";

      String s8 = "hello";
      s8 = s8.concat("!!!");

      // startWith()
      // endWith()

      System.out.println(new String("bootcamp").startsWith("boot")); // True
      System.out.println(new String("bootcamp").indexOf("boot") == 0); // True

      System.out.println( new String("bootcamp").endsWith("boot")); // false


        //replace()
        String s9 = "hello!!!!";
        s9 = s9.replace('!', '?');
        System.out.println(s9);

        s9 = "abcdef";
        s9 = s9.replace("abc", "jkl");
        System.out.println(s9);

        System.out.println("ijk"); //true
        System.out.println("IJK"); //false
        System.out.println("abc"); //false

        // trim()
        String s10 = "  Roy Leung ";
        s10 = s10.trim();
        System.out.println(s10);

        // Wrong Example
        String s11 ="abc";
        String s12 ="abc";
        System.out.println(s11 == s12); //true
        String s13 = new String("abc"); 

        // CompareTo() 8 Wrapper Class and String.class
        // a.compare(b) > 0 -> a>b 
        // a.compare(b) == 0 -> a == b 
        // a.compare(b) < 0 -> a < b 

        //String -> <,>
        // Refer to Ascii
        System.out.println("abc".compareTo("bbc")); // -1
        System.out.println("abc".compareTo("bbc")); // -1
        System.out.println("abc".compareTo("acc")); // -1
        System.out.println("abc".compareTo("abc")); // 0

        // "abc" -> "cde"
        char[] characters = "abc".toCharArray();
        System.out.println(Arrays.toString(characters)); // [a,b,c]

        char c = ' ';
        String result = "";
        for(int i = 0; i < characters.length; i++){
          c = (char) (characters[i] + 2); // char + 2, int cannot dirctly put in to Char array need downgrade
          result += c; // String + char to String
        }
        System.out.println(result);
        String name = "Roy";
        c =  ' ' ;
        result ="";
        char[] names = name.toCharArray();

        for(int i = 0; i < names.length; i++){
          if ((names[i]) > 65 && names[i] < 97) {
          c = (char) (names[i] + 32);
          }
        }
        result += c;
        System.out.println(result);

        String jenny ="Jenny";
        int idx = 0;
        // 2, not found
        char target = 'n';
        for (int i = 0; i < jenny.length(); i++){
          if(jenny.charAt(i) == target){
            idx = i;
            break;
          }
        }
        System.out.println(idx);

        // Last index of
        for(int i = jenny.length() - 1; i > -1 ; i--){
          if (jenny.charAt(i) == target) {
            idx = i;
            break;
          }
        }
        System.out.println(idx);


  }
}
