package com.company;
import java.util.Collections;

import java.util.ArrayList;

public class Airline {

    ArrayList<Plane> planes;

    public Airline(){

        planes = new ArrayList<>();
    }

    public void add(Plane plane){
        planes.add(plane);
    }

    public void sortByMaxFlightDistance(){

        Collections.sort(planes);

    }

    public int TotalPassengerСapacity(){
        var TotalPassengerСapacity = 0;
        for (var plane:planes
        ) {
            TotalPassengerСapacity += plane.getPassengerСapacity();
        }

        return TotalPassengerСapacity;
    }

    public ArrayList<Plane> getPlaneByMaxFuelСonsumption(int minFuelСonsumption, int maxFuelСonsumption){
        ArrayList<Plane> resultPlanes = new ArrayList<>();
        for (var plane:planes
        ) {
           if(plane.getFuelСonsumption() > minFuelСonsumption && plane.getFuelСonsumption() < maxFuelСonsumption){
               resultPlanes.add(plane);
           }
        }
        return resultPlanes;
    }

    public int TotalLiftingСapacity(){
        var TotalLiftingСapacity = 0;
        for (var plane:planes
        ) {
            TotalLiftingСapacity += plane.getLiftingСapacity();
        }

        return TotalLiftingСapacity;
    }

    public void clear(){
        planes.clear();
    }

    public void remove(Plane plane){
        planes.remove(plane);
    }

    @Override
    public String toString() {
        String resultPlaneList = "";
        for (var plane:planes
             ) {
            resultPlaneList += plane.toString() + "\n";
        }
        return resultPlaneList;
    }
}
