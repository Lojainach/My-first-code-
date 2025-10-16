public class Phone {
String brand;
String model;
public Phone(String brand, String model) {
this.brand = brand;
this.model = model;
    }
void call(String name) {
System.out.println("Calling " + name + " from " + brand + " " + model + "...");
    }
void hangUp() {
System.out.println("Call ended.");
    }
    
public static void main(String[] args) {
Phone myPhone = new Phone("iPhone", "15 Pro");
myPhone.call("Thauka");
myPhone.hangUp();
}
}
