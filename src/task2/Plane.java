package task2;

public class Plane extends  Vehicle{

    int height;
    int passengers;

    public Plane(double speed, double price, int year,int height, int passengers) {
        this.speed = speed;
        this.price = price;
        this.year = year;
        this.height = height;
        this.passengers = passengers;
    }
}
