package bai3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new CarBuilder()
                .setEngine("V6")
                .setSeats(5)
                .setColor("Black")
                .build();

        Car car2 = new CarBuilder()
                .setEngine("Hybrid")
                .setSeats(7)
                .setColor("White")
                .build();

        car1.showDetails();
        car2.showDetails();
    }
}
