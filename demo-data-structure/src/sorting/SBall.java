package sorting;

public class SBall {
  private Color2 color;
  private String name;


  public SBall (Color2 color, String name){
    this.color = color;
    this.name = name;
  }

  public Color2 getColor(){
    return this.color;
  }
  public String getName(){
    return this.name;
  }
  public Color2 getValue(){
    return this.color;
  }
  @Override
  public int compareTo(SBall sball){
   // this(-1) , ball (1)
   if(this.color == Color2.GREEN && sball.getColor() == Color2.GREEN){
    if (this.name.compareTo(sball.getName()) == 1)
    return 1;
   }
  }


  @Override
  public String toString(){
   return "Ball = (" 
   + "color = " + this.color + ")";
    }
}
