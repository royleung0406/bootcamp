public class DemoPrinitive{
  public static void main(String[] args) {
    // every line of java code must end with ;
    // Declare and assign
    int x = 100;
    //Declaration. we dont need to define y = waht number
    // "int" is a type that can store an integer 
    int y;
    // Assignment
    y = -13;
    System.out.println(y); // y= -13
    // Re-assignment
    y = 9;
    System.out.println(y); //9
    
    System.out.println(x); // 100
    System.out.println(20); //20
    System.out.println(x); //100
    
    int age = 30;
    //int q =30.5 // 30.5 is a number with decimal, q is declared by in, so cannot store decimal place
    double q = 30.5;
    System.out.println(q);
    
    double u = 10; //10 is int value
    // when int value assign to double type variable
    // Java will help auto-convert int value to double value (10 -> 10.0)
    
    double i = 10.0;
    // 10.0 is adouble value, assign to variable i

    // int k = 10.3;
    // 10.3 is a double value, you canoot assign double value to int type variable
    // because tdouble is a higher lever than int type

    char c = 'i';
    char c2 = '9';
    char c3= ' ';
    // char c4 = '';  // at least one character cannot empty
     

    double d1 = 3.3; // by default 3.3 is a double value
    double d2 = 3.3d; // "d"  is to describe 3.3 is a double value 
    // float f1 = 3.3;
    // float is lower level than double by default, we cannot float f1 = 3.3
    // if you would like to fix it it will be float fi = 3.3f;

    float f2 = 3.3f; // assign float value to float variable

    double d3 = 3.3f; // 3.3f is a float value, it can sub to double and auto upgrade to double value (upgrade we call)
    
    int h = 4; // 4 is an int value 
    long l1 = 4; // Type level of long is higher than int , 4 here will auto-change to 4L
    long l2 = 4L;
    
    //Primitives
    // int, double, float, long,
    // char, byte, short, boolean
    
    // integaer : byte, shot, int, long

    byte b1 = 3; // from -128 to 127
    // assign int value to byte variable
    // int value will downgrade to byte value (implicitly)
    // byte and short can downgrade int by implicitly way

    int i2 = 3;
    // byte b2 = i2; // it is wrong because you define i2 is int with "int i2"
                  // i2 may be 1000000 which is bigger than 127 or smaller than -128
                  // Java will automatically stop u this as it may exceed byte
                  // * Never can downgrade**
     // Assign byte variable to int varibale
     byte b3 = 3;
    System.out.println(b3); 

    int i8 = b1; // ok as byte is lower level than int 
    b1 = -126;
    // b1 = -129; // out of range/
    // b1 = 128; // out of range
    System.out.println(i8);

    short s2 = b1;
    // b1 = -130; //
    b1 = 127;
    System.out.println(s2);

        
    int i3 = s2;
  System.out.println(i3);




    short s1 = 3; // from -32xxx to 32xxx
    int i1 = 3; // from -2.1 billions to 2.1 billion
    long l3 = 3; // from -2^63 to 2^63

    // boolean 
    boolean bl = false;
    bl = true;
    System.out.println(bl);

    boolean result = 3 > 2;
    System.out.println(result); // true
    System.out.println(3>2); // true
    System.out.println(2>3); // false

    int i9 = 200;
    System.out.println(i9 > 196);

    int age2 = 66;
    boolean IsElderly = age2 > 65; // event or definition
    System.out.println(IsElderly); //true



     // 3 is int value 


  }
}