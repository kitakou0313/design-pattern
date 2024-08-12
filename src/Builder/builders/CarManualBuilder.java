package Builder.builders;

import Builder.cars.CarType;
import Builder.cars.Manual;
import Builder.components.Engine;
import Builder.components.GPSNavigator;
import Builder.components.Transmission;

public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
        
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;        
    }

    public Manual getManual(){
        return new Manual(type, seats, engine, transmission, gpsNavigator);
    }
}
