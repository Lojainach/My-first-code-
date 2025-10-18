import java.util.Scanner;
public class Greeting {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("What's your name? ");
String name = input.nextLine();
System.out.println("Hi " + name + "! ");
System.out.println("Hope you’re having a wonderful day "); input.close();
}
}
