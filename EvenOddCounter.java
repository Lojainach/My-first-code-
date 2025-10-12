import java.util.Scanner;
public class EvenOddCounter {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
  int n = input.nextInt();
  int evenCount = 0;
  int oddCount = 0;
for (int i = 1; i <= n; i++) {
  if (i % 2 == 0) {
evenCount++;
  } else {
oddCount++;
 }
 }
System.out.println("Between 1 and " + n + ":");
System.out.println("Even numbers: " + evenCount);
System.out.println("Odd numbers: " + oddCount);
input.close();
}
}
