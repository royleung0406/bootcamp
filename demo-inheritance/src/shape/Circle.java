package shape;

import java.math.BigDecimal;

public class Circle extends Shape {
  private double radius;

  public Circle (double radius){
    super() ;
    this.area = area;
  }

  public Circle (double radius){
  }

 // Override ->Same method Signature
 // @ -> annotation (for compiler to read)
 public double area(){
  return BigDecimal.valueOf(Math.pow(this.radius, 2.0).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
 } 
  public static void main(String[] args) {
    Circle circle = new Circle();
    System.out.println(circle.area());
  }
}
