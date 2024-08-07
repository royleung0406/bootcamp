public class DemoStrings {
  public static void main(String[] args) {
    System.out.println("Hello World");
    // String Val is "Hello World"

    // String is not a primitive !!!! Need Capital Letter
    String s;
    s = "abc";


    String s2 = "def"; // "def" is the string val and the assogn to String Variable
    // String can be "s3"
    // String can be "s4 = true"

    String s3 = "3"; // It is ok but cannot do Calculation
    s3 = s3 + 1; // Append meaning , but not +1
    // String Value + Int Value = String + String (Auto Convert)
    System.out.println(s3); // "31"

    s3 = s3 +true;
    System.out.println(s3); // "31true"

    // In String, there are no -,*,/,%

    // Example 1
    int age = 40;
    String message = "I am "+ age + "years old.";
    System.out.println(message);
    
    // Example 2
    char grade = 'A';
    System.out.println("My Grade is" + grade);
    // String + char = String

    //+= the left side ofthis symbol must need to be variable
    System.out.println("My Grade is" + grade );

    String FirstName = "Roy";
    String LastName = "Leung";
    String FullName = ""; //Empty String Value (can be anything)
    System.out.println(FullName += FirstName + LastName);
    // FullName = FullName + FirstName + LastName

    // Primitive -> Math and Comparison
    // Strings -> Not Primitive, we use method (tool) to compare their values
    String s10 = "Hello World";
    String s20 = "Hello World";
    System.out.println(s10.equals(s20));
    System.out.println(s10 = s20);;
    // Primitive cannot use "." (we call tool)
    // E.g You cannot int = i1 and i1.equals(i2)

    boolean IsValueSame = "abc".equals(s20); //false

    // charAt()
    char result = s10.charAt(1); // 2 nd letter of s10
    System.out.println(result); // e
    System.out.println(s10.charAt(0)); //H

    // length()
    System.out.println(s10.length()); // 5
    System.out.println(s10.length() >= 5); // int 5 >= 5 ? -> true


  }
  
}
