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
      System.out
          .println("The last character of " + str + " is " + str.charAt(len));
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
      System.out.println("" + sar.charAt(Lastword) + sar.charAt(Middleword)
          + sar.charAt(Firstword));
    } else {
      System.out.println("abc");
    }


    // Result cba
    // Leap Year 潤年
    // 1. Divided by 4
    // 2. cannot divided by 100 Or Divided by 400
    // Example 8
    int year = 2000;
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println(year + " is a leap year");
    } else {
      System.out.println(year + " is a not leap year");
    }

    // Another option
    year = 1900;
    Boolean isLeap = false;
    if (year % 4 == 0) { // 2004
      if (year % 100 == 0) { // 1900 2000
        if (year % 400 == 0) { // 2000
          isLeap = true;
        } else
          isLeap = false; // 1900
      } else
        isLeap = true; // 2004
    } else
      isLeap = false; // 2003
    if (isLeap) {
      System.out.println(year + " is a leap year");
      System.out.println(year + " is a leap year");
    } else {
      System.out.println(year + " is a not leap year");
    }
    // Example 9
    int age = 16;
    boolean isCitizen = true;
    if (isCitizen == false && age < 18) {
      System.out.println("You are not eligible due to Age and Citizen Status");
    } else if (isCitizen == false && age >= 18) {
      System.out.println("You are not eligible due to citizenship");
    } else if (isCitizen != false && age < 18) {
      System.out.println("You are not eligible due to Age");
    } else {
      System.out.println("Please vote");
    }

    // eligible to vote
    // Not eligible.Age <18
    // Not eligible.Not a citizen
    // Not eligible.Age <18 and not a citizen
    //

    // Example 10
    double TotalPurchase = 250.0;
    double discount;
    double amountToPay;
    if (TotalPurchase >= 500) {
      discount = TotalPurchase * 0.20;
      amountToPay = TotalPurchase - discount;
      System.out.println("Discount amount = " + discount);
      System.out.println("Amount to pay = " + amountToPay);
    } else if (TotalPurchase >= 200 && TotalPurchase < 500) {
      discount = TotalPurchase * 0.10;
      amountToPay = TotalPurchase - discount;
      System.out.println("Discount amount = " + discount);
      System.out.println("Amount to pay = " + amountToPay);
    } else {
      discount = 0;
      amountToPay = TotalPurchase - discount;
      System.out.println("Discount amount = " + discount);
      System.out.println("Amount to pay = " + amountToPay);
    }

    // Example 11
    char c = 'a';
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
      System.out.println("This letter is vowel");
    } else {
      System.out.println("This is a consonant");
    }


    // Teaching

    String s1 = "Hello";
    System.out.println(s1.contains("ll")); // True
    System.out.println(s1.contains("lll")); // false
    s1 = "helloll";
    System.out.println(s1.contains("ll"));// true
    System.out.println(s1.contains("l")); // true
    // Wii find exact words or part of the words

    // Example 12

    String password = "Admin1234567#";
    if (password.length() >= 12) {
      if (password.contains("!") || password.contains("@")
          || password.contains("#") || password.contains("$")) {
        System.out.println("It's a strong password");
      } else {
        System.out.println("It's a weak password . No special Character");
      }
    } else { // Password < 12
      System.out.println("It is a weak password. Length < 12");
    }
    // if (password.contains("!") || ("@") || ("#") || ("$") && password.length() >= 12) {
    // System.out.println("This is a strong passord");
    // } else if (password.contains("!") || password.contains("@")
    // || password.contains("#")
    // || password.contains("$") && password.length() < 12) {
    // System.out.println("This is a weak password, password length < 12");
    // else
    // System.out.println("This is a weak password, password length < 12");
  }
}

