package com.driver;

public class Boat implements WaterVehicle{
    private int capacity;
    private String name;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }

    @Override
    public String getVehicleName() {
        return this.name;
    }
}
