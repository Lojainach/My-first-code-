import java.util.Scanner;
public class Calculator{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first number: ");
    double a = input.nextDouble();
    
    System.out.print("Enter second number:");
    double b = input.nextDouble();

   double sum = a+b;
    System.out.println("The sum is:" + sum);

    input.close();
  }
}
