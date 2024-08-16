import java.util.Arrays;

public class Demo {
  public static void main(String[] args) {  
    // memory
    int x =3;

    // arr is object reference -> object address
    // int arrary object (length = 2)
    int[] arr = new int[2];

    // c object ref
    // Cat c is object
    Cat cat = new Cat();
    //System.out.println(cat.name); //  Not ok, because "name" is private
    cat.setName("John");
    cat.setColor("white");
    cat.setName("Roal");
    cat.setColor("black");
    System.out.println(cat.getName()); // ok, because you use the return type from Private to Public
    System.out.println(cat.getColor()); // ok, because you use the return type from Private to Public


    Cat cat2 = new Cat();
    cat2.setName("Peter");
    cat2.setColor("Black");
    System.out.println(cat2.getName()); // ok, because you use the return type from Private to Public
    System.out.println(cat2.getColor()); // ok, because you use the return type from Private to Public

    Staff staff = new Staff(); // Staff() Constructor
    staff.setHeight(180);
    staff.setWeight(75);
    // get BMI() class encapaulate complex calculation
    System.out.println(staff.getBMI());

    Staff staff3 = new Staff("Roy", "Leung", 1.8, 76.0);
    System.out.println(staff3.getFullName());
    System.out.println(staff3.getBMI());

    StringBox str = new StringBox("abbcdefggh");
    System.out.println(str.charAt(1));
    System.out.println(str.subString(0, 4));

    StringBox sb2 = str;
    System.out.println(str);
    System.out.println(sb2);
    str.setCharAt(2, 'c');
    System.out.println(String.valueOf(str));
    System.out.println(String.valueOf(sb2));

    char[] arr = str.getCharacters();
  }
}
