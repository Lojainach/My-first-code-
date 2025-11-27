public class Car {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void showInfo() {
        System.out.println("Model: " + model + ", Speed: " + speed + " km/h");
    }

    public void accelerate(int amount) {
        speed += amount;
        System.out.println(model + " accelerated to " + speed + " km/h");
    }

    public static void main(String[] args) {

        Car myCar = new Car("BMW", 80);

        myCar.showInfo();
        myCar.accelerate(20);
    }
}
