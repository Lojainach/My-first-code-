public class Coffee {
String type;
public Coffee(String type) {
this.type = type;
}
void serve() {
System.out.println("Here is your " + type + " coffee ☕️");
}
public static void main(String[] args) {
Coffee myCoffee = new Coffee("Latte");
myCoffee.serve();
    }
}
