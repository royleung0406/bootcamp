import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // A special type in Java
    //Problem (dobblr , float in Math Operation)

    System.out.println(0.2+0.1);
    System.out.println(0.2*0.1);

    //BigDecemal (double)
    BigDecimal bd1 = new BigDecimal("0.2");
    BigDecimal bd2 = new BigDecimal("0.1");
    // Instance Method for math Operation
    double result = bd1.add(bd2).doubleValue();
    System.out.println(result);

    //Multiply
    result = bd1.multiply(bd2).doubleValue();
    System.out.println(result);

    // Divide
    result = bd1.divide(bd2).doubleValue();

    // Subtract
    result = bd1.subtract(bd2).doubleValue();

    // for most of the case, you should start with double
    bd1 = BigDecimal.valueOf(10);
    bd2 = BigDecimal.valueOf(3);
    System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP).doubleValue());
    System.out.println(bd1.divide(bd2, RoundingMode.HALF_UP).doubleValue());
    System.out.println(bd1.divide(bd2, 2, RoundingMode.CEILING).doubleValue());
    System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP).doubleValue());


    System.out.println(BigDecimal.valueOf(3.440).setScale(2, RoundingMode.UP));
    System.out.println(BigDecimal.valueOf(3.455).setScale(2, RoundingMode.HALF_UP));

    //Equal()
    System.out.println(BigDecimal.valueOf(10L).equals(BigDecimal.valueOf(10.0))); //false
    System.out.println(BigDecimal.valueOf(10.0).equals(BigDecimal.valueOf(10.0))); //true
    System.out.println(BigDecimal.valueOf(10L).doubleValue() == BigDecimal.valueOf(10.0).doubleValue()); //true

  }
}
