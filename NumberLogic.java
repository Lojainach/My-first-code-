import java.util.Scanner;
public class NumberLogic {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();
if (number > 0 && number % 2 == 0) {
 System.out.println("The number is positive and even ");
 } else if (number > 0 && number % 2 != 0) {
 System.out.println("The number is positive but odd ");
} else {
 System.out.println("The number is not positive ");
}
input.close();
}
}
