import java.time.MonthDay;

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

    // Example 1
    int number = -3;
    if (number > 0) {
      System.out.println("The number is Positive");
    } else if (number == 0) {
      System.out.println("The number is Zero");
    } else {
      System.out.println("The number is Negative");
    }

    // Example 2
    int score = 85;
    if (score >= 90) {
      System.out.println("A");
    } else if (score >= 80 && score < 90) {
      System.out.println("B");
    } else {
      System.out.println("Fail");
    }

    // Example 3

    int a = 10;
    int b = 20;
    int max;
    int min;
    if (a > b) {
      max = a;
      min = a;
    } else {
      max = b;
      min = a;
      System.out.println(max + "is larger than " + min);
    }

    // Example4
    String day = "";
    String Mon = "Monday";
    String Tue = "Tuesday";
    String Wed = "Wednesday";
    String Thu = "Thursday";
    String Fri = "Friday";
    String Sat = "Saturday";
    String Sun = "Sunday";
    if (day.equals(Sat) || day.equals(Sun)) {
      System.out.println(day + " is weekend");
    } else {
      System.out.println(day + " is weekday");
    }

    // Example 5
    int num;
    num = 11;
    if (num % 2 == 1) {
      System.out.println("This is an odd number");
    } else {
      System.out.println("This is an even number");
    }

    // Example 6
    String str = "Hello";
    int len = str.length() - 1;
    if (len >= 0) {
      System.out.println("The last character of " + str + " is " + str.charAt(len));
    } else {
      System.out.println("This is an empty string");
    }

    // Example 7
    String sar = "abc";
    int TotalLen = sar.length();
    int Lastword = TotalLen - 1;
    int Middleword = Lastword - 1;
    int Firstword = Lastword - Lastword;
    if (Lastword != Firstword) {
        System.out.println("" + sar.charAt(Lastword) + sar.charAt(Middleword) + sar.charAt(Firstword));
    }else {
        System.out.println("abc");
      }


    // Result cba
    // Leap Year 潤年
    // 1. Divided by 4
    // 2. cannot divided by 100 Or Divided by 400

    int year = 2000;
    if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
      System.out.println(year + " is a leap year");
    }else {
      System.out.println(year + " is a not leap year");
     }
  }

}
