package shape;


public abstract class Shape {
private Color color;

public Shape(){

};

public Shape (Color color){
  this.color = color;
}
public Color getColor(){
  return this.color;
}


  public abstract double area();

  public static void main(String[] args) {
    
  }
}
