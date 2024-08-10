package Builder.builders;

import Builder.cars.Car;
import Builder.cars.CarType;
import Builder.components.Engine;
import Builder.components.GPSNavigator;
import Builder.components.Transmission;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType carType){
        this.type = carType;
    }
    
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    
    public void setGpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car buildCar(){
        return new Car(type, seats, engine, transmission, gpsNavigator);
    }
}
