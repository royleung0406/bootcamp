public class DemoCharInt {
  public static void main(String[] args) {
    char c = 'A';
    int x = c; //upcasting
    System.out.println(x); // 65

    // char c2 = x; Not ok

    char c3 = '0';
    int x2 = c3;
    System.out.println(x2); // 48

    // char[] -> String.class
    System.out.println("hello".substring(0, 2)); //he
  
    float f1 = 101L;
    System.out.println(f1);

    double d1 = 100L;
    System.out.println(d1);

    float f2 =10;
    System.out.println(f2);

    float f3 = 'c';
    System.out.println(f3);

    double d2 = 'B';
    System.out.println(d2);

    // char Math operation?
    int sum = 'a' + 'a';
    System.out.println(sum);

    // Counting Example
    int[] cnt = new int [26];
    char[] arr = new char[]{'a', 'y', 'z', 'b', 'a'};
    // Max count value = a
    for (int i =0; i < arr.length ; i++){
      cnt[arr[i] -97 ]++;
    }
    int max = -1;
    char target = ' ';
    for (int i = 0; i < cnt.length; i++){
      if (cnt[i] > max) {
        max = cnt [i];
        target = (char) (i + 97);
      }
    }
    System.out.println(target);
     //int s = 12360;
     //char c2 = (char) s;
     //System.out.println(c2); // Japanese "e"

    // s = 77896; // 66535 + 12361 (Char overflow is from 0)
    // char c3 = (char) s;
    // System.out.println(c2); // Japanese "e"

    // if int s = 1666660000;
    // char c2 = (char) s;
    // System.out.println(c2); Can run but overflow

    // Overflow
    byte b1 = (byte) 128;
    System.out.println(b1); //-128
    b1 = (byte) 129;
    System.out.println(b1);// - 127

    // byte b21 = 128; // Compiler error, Not overflow
     int i21 =128;
     byte b22 = (byte) i21;
     System.out.println(b22); //Overflow

     int[] arr2 = new int[3];
     max = Integer.MIN_VALUE; // -2.1b
     for (int i = 0; i < arr2.length; i++){
      if (arr2 [i] > max){
        max = arr2[i];
      }
     }

      long l2 = Long.MIN_VALUE; // -9223372036854775808
      System.out.println(l2); // 2^ - 63 

    }
    
  }
