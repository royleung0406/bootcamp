import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLopp {
  public static void main(String[] args) {
    int sum =0;
    for (int i =0 ; i < 5; i++) {
      sum += i; 
    }
    System.out.println(sum);

    // While
    int count = 0;
    sum = 0;
    while (count < 5) {
      sum += count;
      count++;
    }
    System.out.println(sum);

    // Random
    int value = new Random().nextInt(100) + 1;
    System.out.println(value);

    // Guess a number
   

      // Leetcode
      int code = 1234;

      // Approach 1
      // int -> Integer -> String -> char
      char[] codes = new Integer(code).toString().toCharArray();
      System.out.println(Arrays.toString(codes)); // [1, 2, 3, 4]

      //Approach 2
      int a = code;
      int arrLength = 0;
      while (a > 0){
        a = a / 10;
        arrLength++;
        //(char) (a % 10 + '0');
      }
      codes = new char[arrLength];
      a = code;
      int idx = 0;
      while (a > 0) {
        codes[idx++] = (char) (a % 10 + '0');
        a= a/10;
      }
      System.out.println(Arrays.toString(codes));
      //reverse
      char backup = ' ';
      for (int i = 0; i < codes.length / 2; i++){
        backup = codes[i];
        codes[i] = codes[codes.length -i -1 ];
        codes[codes.length -i -1 ] = backup;
      }
      System.out.println(Arrays.toString(codes));

      int count2 = 0;
      int sum2 = 0;
      while (true) { // hard code must do
        if (count2 > 4){
          break;}
          sum2 += count2;
          count2++;
      }
      System.out.println(sum2);
    }
  } 
