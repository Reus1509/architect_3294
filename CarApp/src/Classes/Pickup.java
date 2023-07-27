package Classes;

import Staff.Color;

public class Pickup extends Car implements Refueling{
    private Integer loadCapacity;

    public Pickup(String make, String model, Color color, TypeCar bodyType, Integer numberWheels, TypeFuel fuel,
            TypeGearbox gearbox, Float engineCapacity, Integer loadCapacity) {
        super(make, model, color, bodyType, numberWheels, fuel, gearbox, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    public Integer getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Integer loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

        @Override
    public Integer GearShifting(Integer gear) {
        return 0;
    }

        @Override
        public void Fuel() {

    }
}
