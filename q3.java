class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int speed;

    // Constructor
    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    // Overriding compareTo() method
    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(this.speed, otherCar.speed);
    }

   
}

public class q3 {
    public static void main(String[] args) {
        // Creating two car objects
        Car car1 = new Car("Toyota", "Red", 180);
        Car car2 = new Car("Honda", "Blue", 200);

        // Comparing car objects according to their speed
        int comparisonResult = car1.compareTo(car2);

        if (comparisonResult > 0) {
            System.out.println("Car 1 has greater speed:");
            System.out.println("Model: " + car1.getModel());
            System.out.println("Color: " + car1.getColor());
            System.out.println("Speed: " + car1.getSpeed() + " km/h");
        } else if (comparisonResult < 0) {
            System.out.println("Car 2 has greater speed:");
            System.out.println("Model: " + car2.getModel());
            System.out.println("Color: " + car2.getColor());
            System.out.println("Speed: " + car2.getSpeed() + " km/h");
        } else {
            System.out.println("Both cars have the same speed.");
        }
    }
}
