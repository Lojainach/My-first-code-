import java.util.Scanner;
public class Multiplication {
 public static void main(String [] args){
 Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
double a = input.nextDouble();

System.out.print("Enter secound number: ");
double b = input.nextDouble ();

double multiplication =a * b;
double division;

if (b !=0) {
division = a/b;
System.out.println("Multiplication;" + multiplication);
System.out.println("Division: " + division);
} else {
System.out.println("Multiplication:" + multiplication);
System.out.println("Division: Cannot divide by zero!");
}
input.close();
}
}

