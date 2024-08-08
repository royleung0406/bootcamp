public class DemoMathOperation {
  public static void main(String[] args) {
    int x = 10+ 3;
    System.out.println(x); // 13

    x = x +3 -9;
    System.out.println(x); // 7

    x = x - 5 * 2; // 5 * 2 first
    System.out.println(x); // -3

    x = (x - 1) /2; // (-3 - 1) / 2
    System.out.println(x);

    // Sytem Operation -> %
    int remainder = 5 % 2;
    System.out.println(remainder); // 1

    int remainder2 = 10 % 2;
    System.out.println(remainder2); // 0

    System.out.println(0/ 10 ); // 0
    // System cannot pront out 10 / 0

    int j = 2;
    System.out.println(10 / j);
    // you shd avoid j = 0 before u do any calculation
  
    // double 
    // +, -, *, /, %
    // / zero

    double remainder3;
    remainder3 = 10.5;
    remainder3 = remainder3 + 5;
    System.out.println(remainder3); // 15.5

    remainder3 = remainder3- 2;
    System.out.println(remainder3); // 13.5

    remainder3 = remainder3 * 5; // 67 .5
    System.out.println(remainder3);
    
    remainder3 = remainder3 / 3;
    System.out.println(remainder3); //22.5

    remainder3 = remainder3 / 0;
    System.out.println(remainder3); // infinity

     remainder3 = 0.2 + 0.1;
    System.out.println(remainder3); // 0.300000000004
    
    // +1 operations
    int a = 1;
     a = a + 1;
     ++a;
     a++;
     a += 1; // equals to "a = a + 1 "
     System.out.println(a); //5

     // + 2 operations
     int b = 1;
     b = b + 2;
     b += 2;
     System.out.println(b); // 5

     // -1 operations
     a = a - 1;
     --a;
     a--;
     a -= 1; // equals to "a = a - 1 "
     System.out.println(a); // 1 

    // * 2 operations
    b = b * 2;
    b *= 2;
    System.out.println(b); // 20

    // Divde 3 operations
    int r = 99;
    r = r / 3;
    r /= 3;
    System.out.println(r); // 11

    // Example 1
    int apples = 3;
    int oranges = 10;
    double PricePerApple = 3.3 ;
    double PricePerOrange = 5.5;

    // Code

    double TotalAmount;
    TotalAmount = apples * PricePerApple + oranges * PricePerOrange;
    System.out.println(TotalAmount); // 64.9
    // int * double + int * double
    // = double * double + double * double
    // low lever variable can upgrade to higher level variable
    
    // Example 2
    int maths = 90;
    int english = 78;
    int history = 62;

    double AverageScore;
    AverageScore = (maths + english + history) / 3;
    // (int + int + int) / Int
    // int / int
    // Suppose  230/ 3 -> 76.6666
    // But int / int must = Int


    System.out.println(AverageScore); // 76.0

     // if you would like to have decimal place, you must need to devide 3.0 instead 3
     AverageScore = (maths + english + history) / 3.0;
     System.out.println(AverageScore);

    // 3 is an integer but 3.0 is a double variable (double variable is decimal place)
  
    // ++x, x++, --x, x--
    int k = 6;
    int o = k++ + 3; // 4
    System.out.println(o);
    System.out.println(k);
    // k++ +3=
    // Step 1. k+3 sin
    // Step 2. Assignment 
    // Step 3 K+1


    int u = 0;
    int e = ++u +3;
    // Step 1. u+1
    // Step 2. U+3
    // Step 3. Assignment
    System.out.println(e); // 4
    System.out.println(u); // 1

    int ab = 3;
    int y = (ab++ + 3) * ab++;
    System.out.println(y);
    System.out.println(ab);
    // ab++ will assign at last step unless have one more ab++, it will do before another ++
  }
  
}