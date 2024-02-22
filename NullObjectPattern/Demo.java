package NullObjectPattern;

import DecoratorPattern.VehicleType;

// Null object is a special type of strategy pattern.
// Null object pattern simplifies the use of dependencies that can be undefined.

public class Demo {
    public static void main(String[] args)
    {
        Vehicle car = VehicleFactory.getVehicle(VehicleType.CAR);
        System.out.println(car.getSeatingCapacity()+", "+car.getTankCapacity());

        Vehicle bike = VehicleFactory.getVehicle(VehicleType.BIKE);
        System.out.println(bike.getSeatingCapacity()+", "+bike.getTankCapacity());
    }
}
