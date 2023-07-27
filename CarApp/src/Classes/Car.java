package Classes;

import Staff.Color;

public abstract class Car {
    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private Integer numberWheels;
    private TypeFuel fuel;
    private TypeGearbox gearbox;
    private Float engineCapacity;

    public Car(String make, String model, Color color, TypeCar bodyType, Integer numberWheels, TypeFuel fuel,
            TypeGearbox gearbox, Float engineCapacity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
        this.fuel = fuel;
        this.gearbox = gearbox;
        this.engineCapacity = engineCapacity;
    }
    public void Movement(){}
    public void Maintenance(){}
    public abstract Integer GearShifting(Integer gear);
    public boolean TurnOnHeadLights(){return true;}
    public boolean TurnOnWipers(){return true;}
    
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public TypeCar getBodyType() {
        return bodyType;
    }
    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }
    public Integer getNumberWheels() {
        return numberWheels;
    }
    public void setNumberWheels(Integer numberWheels) {
        this.numberWheels = numberWheels;
    }
    public TypeFuel getFuel() {
        return fuel;
    }
    public void setFuel(TypeFuel fuel) {
        this.fuel = fuel;
    }
    public TypeGearbox getGearbox() {
        return gearbox;
    }
    public void setGearbox(TypeGearbox gearbox) {
        this.gearbox = gearbox;
    }
    public Float getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(Float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
