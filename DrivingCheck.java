import java.util.Scanner;
public class DrivingCheck {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
 System.out.print("Enter your age: ");
 int age = input.nextInt();
if (age >= 18) {
 System.out.println("You can drive! ");
   } else {
 System.out.println("You’re too young to drive ");
 }
input.close();
}
}
