public class Person {
    String name;
    int age;
    public Person(String name, int age) {
    this.name = name;
    this.age = age;
    }

    void introduce() {
    System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person {
    String university;
    public Student(String name, int age, String university) {
    super(name, age);
    this.university = university;
    }

    void study() {
    System.out.println(name + " is studying at " + university + ".");
    }
    public static void main(String[] args) {
    Student s1 = new Student("Lojain", 21, "TU München");
    s1.introduce();
    s1.study();
    }
}
