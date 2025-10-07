public class Animal {
  void sound() {
  System.out.println("The animal makes a sound");
    }
}
class Cat extends Animal {
  String name;

    public Cat(String name) {
    this.name = name;
    }
    void sound() {
    System.out.println(name + " says: Meow!");
    }
    public static void main(String[] args) {
    Cat myCat = new Cat("Ragnar");
    myCat.sound();
    }
}
