package Builder;

import Builder.Director.Director;
import Builder.builders.CarBuilder;
import Builder.cars.Car;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.constructCityCar(carBuilder);
        Car car = carBuilder.buildCar();
        
    }
}
