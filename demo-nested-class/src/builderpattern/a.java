package builderpattern;

public class a {
  public static void main(String[] args) {
   Person p1 = Person.builder().age(10).name("Haha").build();
   System.out.println(p1);
  }
}
