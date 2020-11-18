package com.company;

public class Plane implements Comparable{

    private String name;
    private int maxFlightDistance;
    private int fuelСonsumption;
    private int liftingСapacity;
    private int passengerСapacity;



    public Plane(String name, int maxFlightDistance, int fuelСonsumption, int liftingСapacity, int passengerСapacity) {
        this.name = name;
        this.maxFlightDistance = maxFlightDistance;
        this.fuelСonsumption = fuelСonsumption;
        this.liftingСapacity = liftingСapacity;
        this.passengerСapacity = passengerСapacity;
    }

    @Override
    public int compareTo(Object plane) {
        plane = (Plane)plane;
        int comparemaxFlightDistance=((Plane)plane).maxFlightDistance;
        return this.maxFlightDistance-comparemaxFlightDistance;

    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }
    public void setMaxFlightDistance(int maxFlightDistance) {
        this.maxFlightDistance = maxFlightDistance;
    }

    public int getFuelСonsumption() {
        return fuelСonsumption;
    }
    public void setFuelСonsumption(int fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
    }

    public int getLiftingСapacity() {
        return liftingСapacity;
    }
    public void setLiftingСapacity(int fuelСonsumption) {
        this.liftingСapacity = liftingСapacity;
    }

    public int getPassengerСapacity() {
        return passengerСapacity;
    }
    public void setPassengerСapacity(int fuelСonsumption) {
        this.passengerСapacity = passengerСapacity;
    }

    @Override
    public String toString() {

        return name + ",  Max Flight Distance: " + maxFlightDistance + ", Fuel Сonsumption: " + fuelСonsumption +
        ", Lifting Сapacity: " + liftingСapacity + ", Passenger Сapacity: " + passengerСapacity;
    }
}
