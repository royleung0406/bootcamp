public class Customer {
  private int age;

  public Customer (int age){
    this.age = age;}

    public void serAge (int age){
      this.age =age;
    }
    // Presentation
    public boolean isElderly(){
      return this.age >= 66;
    }
    public static void main(String[] args) {
      Customer customer = new Customer(70);
      customer.serAge(70);
      System.out.println(customer.isElderly()); // true
      
    }
}
