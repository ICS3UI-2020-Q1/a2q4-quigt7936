import java.util.Scanner;
/**
 * The program tells the shopper how much money they owe after a special discount
 * @author Thomas Quigley
 */
public class Main {

  
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    
    // asks the user how much money they spent and stores the amount
    System.out.println("Please enter the amount the customer spent");
    double moneySpent = input.nextDouble();

    // to make the output match the discount variable can't be a double, but if the variable is an integer then the calculations fail, so I made two versions 1 for each purpose.
    
    // declare the discount variable for the output
    int userDiscount;

    // figures out which discount bracket they go in
    if (moneySpent <= 40 && moneySpent > 0) {
      userDiscount = 10;
    } else if (moneySpent <= 80 && moneySpent > 40) {
      userDiscount = 20;
    } else if (moneySpent <= 120 && moneySpent > 80) {
      userDiscount = 30;
    } else {
      userDiscount = 40;
    }
    // initialize the discount variable for calculations
    double userDiscountDouble = userDiscount;

    // figures out how much money they save and how much they now have to spend
    double moneySaved = moneySpent * (userDiscountDouble / 100);
    double newTotal = moneySpent - moneySaved;

    // tell the user how much money they saved, their new total and their discount
    System.out.println("They will receive " + userDiscount + "% off.");
    System.out.println("They will save $" + moneySaved + ".");
    System.out.println("The new total is $" + newTotal +".");
  }
}
