package com.company;
import java.awt.desktop.QuitEvent;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Airline airline = new Airline() {
            {
                add(new Plane("Airbus A330-900neo", 10000, 13, 50000,150));
                add(new Plane("Airbus A320neo", 5000, 15, 10050,482));
                add(new Plane("Mitsubishi Regional Jet", 7000, 8,51070,147));
                add(new Plane("Comac C919", 6000, 24,74072,420));
                add(new Plane("CR929", 12000, 7,28260,782));
            }
        };

        System.out.println(airline.toString());
        airline.sortByMaxFlightDistance();
        System.out.println("sortByMaxFlightDistance: ");
        System.out.println(airline.toString());

        System.out.println( "Total Passenger Сapacity: " + airline.TotalPassengerСapacity());
        System.out.println( "Total lLifting Сapacity: " + airline.TotalLiftingСapacity());

        int minFuelСonsumption = 10;
        int maxFuelСonsumption = 20;
        System.out.println( "getPlaneByMaxFlightDistanceRange: " + minFuelСonsumption + " - " + maxFuelСonsumption);

        var resultPlaneList =  airline.getPlaneByMaxFuelСonsumption(minFuelСonsumption,maxFuelСonsumption);
        for (var plane:resultPlaneList
        ) {
            System.out.println(plane.toString() );

        }
        }



}
