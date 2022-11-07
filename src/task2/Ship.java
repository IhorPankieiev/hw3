package task2;

public class Ship extends Vehicle{
    int passengers;
    String port;

    public Ship(double price, double speed, int year, int passengers, String port) {
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.passengers = passengers;
        this.port = port;
    }
}
