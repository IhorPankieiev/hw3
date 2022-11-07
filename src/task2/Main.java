package task2;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(670, 100000, 2004, 30000, 100);
        Ship ship = new Ship(200000, 299, 1990, 300, "Amsterdam");
        Car car = new Car(2000, 200, 1969);

        System.out.println("Plane specs:" + plane.speed + " " + plane.price + " "
                + plane.year + " " + plane.height + " " + plane.passengers);

        System.out.println("Ship specs:" + ship.speed + " " + ship.price + " "
                + ship.year + " " + ship.passengers + " " + ship.port);

        System.out.println("Car specs:" + car.speed + " " + car.price + " " + car.year);

    }
}
