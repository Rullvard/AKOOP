package com.HK;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // ## Project 1 ## \\

        // The project address is required when creating a new project
        Address client1 = new Address("123 Main Street", "Somewhere", "FA", "1337");

        LocalDate start1 = LocalDate.parse("2019-02-17");
        LocalDate end1 = LocalDate.parse("2021-05-17");

        // Creating a new project for building a house
        Project p1 = new Project("House", "John Doh", client1, start1, end1);


        // ## Project 2 ## \\

        Address client2 = new Address("137 Long Street", "Nowhere", "NO", "666");
        LocalDate start2 = LocalDate.parse("2020-01-01");
        LocalDate end2 = LocalDate.parse("2022-02-02");
        Project p2 = new Project("Pool lights", "Filthy Ritch", client2, start2, end2);


        // Creating addresses
        Address addressE = new Address("Moldegata 11", "Oslo", "Oslo", "0445");
        Address addressC = new Address("Prinsens Gate  22", "Oslo", "Oslo", "0331");
        Address addressP = new Address("Carl Johan 47", "Apt. 12C", "Oslo", "Oslo", "0561");

        // Creating three worker objects, an electrician, carpenter and a plumber
        Worker e = new Electrician("Eric", "Trick", addressE, 1111, 17, 190);
        Worker c = new Carpenter("Carol", "Penter", addressC, 2222, 27, 175);
        Worker p = new Plumber("Per", "Umber", addressP, 3333, 14, 180);

        // Create an ArrayList to hold the workers for a specific project
        ArrayList<Worker> workers = new ArrayList<>();

        // Add all three workers to the list
        workers.add(e);
        workers.add(c);
        workers.add(p);

        // Set the material costs for the each of the workers,
        // notice that it the worker object must be cast as a Carpenter to access the setLumberCost method etc.
        ((Electrician)e).setWiringCosts(3200);
        ((Carpenter)c).setLumberCost(2000);
        ((Plumber)p).setPlumbingCost(1750);

        p1.addWorkers(workers); // House project requires all three workers
        p1.setOverhead(.18);    // The overhead is higher for a house

        System.out.printf(p1.toString(), p1.getName(), p1.getTotalCost(), p1.getOverhead());
        System.out.println("\n===========================================\n" +
                            "#############  New Project  ###############\n" +
                            "===========================================");

        workers.remove(p); // Project 2 does not need a plumber
        workers.remove(c); // Project 2 does not need a carpenter
        ((Electrician)e).setWiringCosts(7000);
        workers.get(0).setHoursWorked(37); // Set hours worked to 37
        p2.addWorkers(workers);

        System.out.printf(p2.toString(), p2.getName(), p2.getTotalCost(), p2.getOverhead());

        if (p2.compareTo(p1) < 0) {
            System.out.println("\nThe " + p2.getName() + " project is " + "scheduled before to " + p1.getName());
        } else {
            System.out.println("\nThe " + p1.getName() + " project is " + "scheduled prior to " + p2.getName());
        }
        System.out.println("\n");

    }
}
