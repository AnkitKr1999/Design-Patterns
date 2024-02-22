package NullObjectPattern;

import DecoratorPattern.VehicleType;

public abstract class VehicleFactory {
    public static Vehicle getVehicle(VehicleType vehicleType){
        switch (vehicleType) {
            case VehicleType.CAR:
            return new Car();
            default:
                return new NullVehicle();
        }
    }
}
