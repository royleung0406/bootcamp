public class Person {
  private String name;
  private int age;

//default empty constructor, only if you didnt create another constructor
//empty, allargs

  public Person (String name, int age){
    this.name = name;
    this.age = age;
  }
  // You can just read the attribute from objects, if there is no setter.
  // You cannot override/ rewrite the attribute anymore after object creation
  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  // Testing
  public static void main(String[] args) {
    //memory
    // When you create 1 all-arg constructor only
    //compiler will not create the empty constructor for you anymore
    // Person person = new Person(); compile error
    Person person = new Person("null", 66);
    System.out.println(person.getName());
    System.out.println(person.getAge());
  }
}
