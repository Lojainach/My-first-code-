import java.util.Scanner;
public class TemperatureConverter {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("=== Temperature Converter ===");
System.out.println("1. Celsius to Fahrenheit");
System.out.println("2. Fahrenheit to Celsius");
System.out.print("Choose an option (1 or 2): ");
int choice = input.nextInt();
double result;
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            result = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + result + "°F");
} else if (choice == 2) {
System.out.print("Enter temperature in Fahrenheit: ");
double fahrenheit = input.nextDouble();
result = (fahrenheit - 32) * 5 / 9;
System.out.println("Temperature in Celsius: " + result + "°C");
} else {
System.out.println("Invalid option");
}

input.close();
}
}
