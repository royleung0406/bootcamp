public class Cat { //blueprint
  //attributes
  private String color;
  private String name;
  private int age;

    // instance method (object method)
    // getter
    public String getName(){
      return this.name;
    }

    public void setName(String x){
      this.name = x ;
    }

      public void setColor (String x){
        this.color = x;
      }

      public String getColor(){
        return this.color;
      }

      public void setAge (int age){
        this.age = age;
      }

      public int getAge(){
        return this.age;
      }
    }
      

