import java.util.Scanner;
public class MaxNumber {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the first number: ");
int a = input.nextInt();
System.out.print("Enter the second number: ");
int b = input.nextInt();
System.out.print("Enter the third number: ");
int c = input.nextInt();
int max;
if (a >= b && a >= c) {
  max = a;
} else if (b >= a && b >= c) {
  max = b;
} else {
  max = c;
}
System.out.println("The largest number is: " + max);
input.close();
}
}
