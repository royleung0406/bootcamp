public class Staff {
  private int id;
  private double salary;
  private String firstName;
  private String lastName;
  private double height;
  private double weight;


  // empty constructor // implicitly exists
  public Staff(){
    System.out.println("Creating new Staff Object");
    this.salary = 20000;
    // you can perform any logic here...
    // For (){}
    // If(){}



  }

  public Staff(String firstName, String lastName, double height, double weight){
    this.firstName = firstName;
    this.lastName = lastName;
    this.height = height;
    this.weight = weight;
  }
  // instance method
  // getter ..
  // setter ..

  // Powerful presentation
      public String getFullName(){
        return this.firstName + " " + this.lastName;
      }

       public double getBMI(){
        return this.weight / Math.pow(this.height, 2.0);
       }

       public void setHeight(double height){
        this.height = height;
       }
       public void setWeight(double Weight){
        this.weight = weight;

       }

}
