import java.util.Scanner;
public class CoffeeOrderApp{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
  System.out.println("Welcome to Lojain's Coffee ☕️");
  System.out.println("1. Espresso");
  System.out.println("2. Latte");
  System.out.println("3. Cappuccino");
  System.out.print("Choose your coffee (1-3): ");
  int choice = input.nextInt();
String coffee = " ";
double price = 0;
 switch (choice){
   case 1:
     coffee = "Espresso";
     price = 2.50;
     break;
   case 2:
     coffee = "Latte";
     price = 3.00;
     break;
   case 3:
     coffee = "Cappuccino";
     price = 3.50;
     break;
   default:
     System.out.println("Invalid choice");
     input.close();
     return;
 }
     System.out.print("How many cups? ");
      int quantity = input.nextInt();
      double total = price * quantity;
     System.out.println("You ordered " + quantity + " x " + coffee);
     System.out.println("Total price: $" + total);
     System.out.println("Thank you for your order ");
        input.close();
    }
}     
