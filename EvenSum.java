import java.util.Scanner;
public class EvenSum {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = input.nextInt();
int sum = 0;
for (int i = 1; i <= n; i++) {
if (i % 2 == 0) {
sum += i;
}
}
System.out.println("The sum of all even numbers from 1 to " + n + " is " + sum + ".");
input.close();
}
}
