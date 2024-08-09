package Builder.cars;

import Builder.components.Engine;
import Builder.components.GPSNavigator;
import Builder.components.Transmission;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
    }
}
