import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    // User input
    Scanner s = new Scanner(System.in);
    System.out.println("Please input a number: ");

    int input = s.nextInt(); 
    // Terminal will stop at "s.nextInt()", and wait for a user input
    // After Capturing the user input --> it will retrieve the user input and do assignment
    
    // the user input is odd number
    // the user input is even number
    if (input % 2 == 0) {
      System.out.println("This is an even number");
    } else {
      System.out.println("This is an odd number");
    }

    // Example 2
    Scanner s2 = new Scanner(System.in);
    System.out.println("Please choose an option: ");
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Check Balance");

    double currentBalance = 300.0;
    int option = s2.nextInt();
    if (option == 1) {
      System.out.println("Please input the amount you would like to deposit: ");
      double depositedAmount = s2.nextInt();
      System.out.println("You have deposited " + depositedAmount );
      double newBalace = depositedAmount + currentBalance;
      System.out.println("Your New Balance is: " + newBalace);
    } else if (option == 2){
      System.out.println("Please input the amount you would like to withdraw: ");
      double withdrawAmount = s2.nextInt();
      System.out.println("You have withdrawn " + withdrawAmount );
      double newBalace = currentBalance - withdrawAmount;
      System.out.println("Your New Balance is: " + newBalace);
    }else if (option == 3){
      System.out.println("Your Balance is: ");
  }else {
    System.out.println("Please re-choose the option!");
  }
}
}
