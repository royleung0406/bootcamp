public class DemoStringBuilder {
  public static void main(String[] args) {
    
  
long startTime = System.currentTimeMillis(); //ms
String s1 = "";
for (int i = 0; i < 100_000; i++){
  s1 += "a";
} 
long afterTime = System.currentTimeMillis();
System.out.println(afterTime - startTime);

startTime = System.currentTimeMillis();
StringBuilder sb2 = new StringBuilder("");
for (int i = 0; i< 100_000; i++){

sb2.append("a");

}
afterTime = System.currentTimeMillis(); 
System.out.println(afterTime - startTime);


}
}