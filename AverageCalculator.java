import java.util.Scanner;
public class AverageCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the first number: ");
double a = input.nextDouble();
System.out.print("Enter the second number: ");
double b = input.nextDouble();
System.out.print("Enter the third number: ");
double c = input.nextDouble();
double average = (a + b + c) / 3;
System.out.println("The average is: " + average);
input.close();
}
}
