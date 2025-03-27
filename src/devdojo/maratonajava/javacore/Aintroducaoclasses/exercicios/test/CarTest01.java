package devdojo.maratonajava.javacore.Aintroducaoclasses.exercicios.test;

import devdojo.maratonajava.javacore.Aintroducaoclasses.exercicios.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.model = "Fusca";
        car1.brand = "Volkswagen";
        car1.year = 1969;

        // car1 = car2;

        car2.model = "Civic";
        car2.brand = "Honda";
        car2.year = 2021;

        System.out.println("Car 1");
        System.out.println("Brand: " + car1.brand);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);
        System.out.println("----------------");
        System.out.println("Car 2");
        System.out.println("Brand: " + car2.brand);
        System.out.println("Model: " + car2.model);
        System.out.println("Year: " + car2.year);
    }

}
