public class DemoSwitch {
  public static void main(String[] args) {
    int age = 18;
    boolean isAdult = false;
    if (age >= 18) {
      isAdult = true;
    }
    System.out.println("isAdult = " + isAdult);

    isAdult = false;
    // 1. if you do not use "break", the switch case will go through all the case
    // 2. for "case".you can only define 1 value for checking
    // 3. It is only for finite cases
    // 4. For "switch", Java will check your case value, it alerts you when duplicate
    // 5. "default" other case
    // 6. If you dont break, it will print out all case include default after system located the vaule you want,
    //   but aforehead the target, it will not show
    String day = "Tuesday";
    switch (day) {
      case "Monday":
        System.out.println("it is weekday");
        break;
      case "Tuesday":
        System.out.println("it is weekday");
        break;
      case "Wednesday":
        System.out.println("it is weekday");
        break;
      case "Thursday":
        System.out.println("it is weekday");
        break;
      case "Friday":
        System.out.println("it is weekday");
        break;
      default:
        System.out.println("it is weekend");
        break;
    }

  }
}
