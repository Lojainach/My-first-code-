import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number for the multiplication table:");
int number = input.nextInt();

System.out.println("Multiplcation Table for" + number + ":");
 for (int i = 1; i<=10; i++){
System.out.println(number + "x" + i + "+=" + (number*i));
}
input.close();
}
}
