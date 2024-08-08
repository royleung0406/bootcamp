
public class DemoForLoop {
  public static void main(String[] args) {
    int x = 3;
    x *= 3;
    x *= 3;
    x *= 3;
    System.out.println(x); // 81

    int y = 3;
    for (int i = 0; i < 3; i++) { // "i" is Counter initialization; continue condition
      y = y * 3;
    }
    System.out.println(y);
    // Step 1: int i =0
    // Step 2: i < 3 -> true
    // Step 3: y = y * 3
    // Step 4: i ++ -> i = 1
    // Step 5: Repeat untill i =3
    // Step 6: i =3 which is not < 3
    // Step 7: Stop loop, Y does not change

    // Example 1
    for (int i = 0; i < 5; i++) {
      System.out.println("Hello World");
    }

    // Example 2
    // we can use i for other purpose.
    for (int i = 0; i < 6; i++) {
      System.out.println(i);
    }

    // Example 3
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    // Example 4
    for (int i = 10; i > -1; i--) {
      if (i % 2 == 0) {
        System.out.println(i);

      }
    }
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        System.out.println(10 - i);
      }
    }

    // Example 5
    //
    String str = "abcdefghijk";
    String str2 = "";
    for (int i = 0; i < str.length(); i++) {
      if (i % 2 == 0) {
        str2 += str.charAt(i);
      }
    }
    System.out.println(str2);
    // resuit acegik

    // Example 6
    String s2 = "bbbaaaaadddddeeeebdebcde";
    char target = 'e';
    int total = 0;
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == target) {
        total++;
      }
    }
    System.out.println("The number of character " + target + " is " + total);

    // Example 7 - counting
    total = 0;
    for (int i = 0; i < 101; i++) {
      if (i % 3 == 0 || i % 4 == 0) {
        total++;
      }
    }
    System.out.println(total);

    // Example 8 (1- 50)
    total = 0;
    for (int i = 0; i < 51; i++) {
      if (i % 2 != 0) {
        total += i;
      } else
        total -= i;
    }
    System.out.println(total);

    // Example 9
    boolean found = false;
    int pos = -1;
    target = 'j';
    String s3 = "abcdxyzik";
    // print the index (position) of j , if J knot found return "-1"
    for (int i = 0; i < s3.length(); i++) {
      if (s3.charAt(i) == target) {
        found = true;
        pos = i;
      }
    }
    if (found = true) {
      System.out
          .println("The Target character you would like to know is " + pos);
    }
    // Example 10
    String s4 = "Hello";
    char targetEndWith = 'o';
    System.out.println(s4.charAt(s4.length()-1) == targetEndWith); // true

    // endswith("") , startswith("")
    System.out.println(s4.endsWith("o")); // true
    System.out.println(s4.startsWith("he")); // true
    System.out.println(s4.startsWith("eh"));  // false

    // EXAMPLE 11
    String s5 = "abcdefghijk";
    // Find "def"
    System.out.println(s5.contains("def"));
    // Find the index berween 2 -4
    System.out.println(s5.substring(2, 5)); // cde
    System.out.println(s5.indexOf("abc")); // 0
    System.out.println(s5.substring(0,3)); //abc

    // Example 11
    String s6 = "abcdefghijk";
    String substring = "def";
    str = ""; 
    for (int i =0; i < s6.length(); i++){
        str += str;
      }
      //Nested loop
      for (int i = 0; i < 3; i++){
        for (int j = 0; j < 2; j++){
          System.out.println("i=" + i + "j=" + j);
        } 
      }
      //Example 12
      //break
      for(int i = 0; i < 5; i++){
        System.out.println("Hello");
        if (i >= 3) {
          break;
        }
      }
      // Example 13
      // break Searching
      String s7 = "ijkdef";
      found = false;




      // Example 14
      // Continue - skip some pattern
      for (int i =0; i <50; i++) { //0-49
        if (i % 2 == 0){
        continue; // skip the rest of code for iteration  
        }
        if (i>30){
          break;
        }
        System.out.println(i);
      }

      // Example 15
      // *******
      for(int i =0; i <5; i++) {
        System.out.print("*");
      }
      System.out.println("");

      //Exxample 16
      for (int i = 0; i < 5; i++){
        for (int j = 0; j < 5 - i; j ++ ){
          System.out.print("*");
        }
        System.out.println("");
      }
    }

  }