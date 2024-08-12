package Builder.Director;

import Builder.builders.Builder;
import Builder.cars.CarType;
import Builder.components.Engine;
import Builder.components.GPSNavigator;
import Builder.components.Transmission;

public class Director {
    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0));
        builder.setTransmission(Transmission.SEMI_AUTO);
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setGPSNavigator(new GPSNavigator());
    }

}
