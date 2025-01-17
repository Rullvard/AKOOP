package com.HK;

import java.time.LocalDate; // To create date objects for the start/end dates for each project
import java.util.ArrayList; // Using ArrayList simplifies adding/removing/updating workers assigned to projects

public class Project implements Comparable {

    public ArrayList<Worker> workers = new ArrayList<>();
        private String projectName, customer;
    private Address projectAddress;
    private double overheadPercent = .10, overheadAmount;
        private LocalDate startDate, endDate;       // Use the LocalDate class to store the start / end date of the project

    public Project(String projectName, String customer, Address projectAddress, LocalDate startDate, LocalDate endDate) {
        this.projectAddress = projectAddress;
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
    }

    public Project(String projectName, String owner, Address projectAddress) {
        this.projectAddress = projectAddress;
        this.projectName = projectName;
        customer = owner;
    }

    public String getName() {return projectName;}
    public double getOverhead() {return overheadAmount;}
    public double getTotalCost() {return calculateProjectCost();}
    public void setOverhead(double overhead) {
        this.overheadPercent = overhead;
    }

    public void addWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    public double calculateProjectCost() {
        double totalCost = 0;
        for (Worker w:workers) {
            totalCost += w.calculatePay(); // Semicolon
        }
        overheadAmount = overheadPercent * totalCost;
        totalCost += overheadAmount;
        return totalCost;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Project) {
            if (((Project) o).startDate.isAfter(this.startDate))
                return -1;
        }
        return 1;
    }
        @Override
            public String toString() {
            String projectDetails;
            projectDetails = "\n===========================================\n" +
                    "----------- Project information -----------\n" +
                    "===========================================\n\n" +
                    "Project Name: %s" + "\nStart Date: " + startDate +
                    "\nCustomer: " + customer + "\nAddress: " + projectAddress.toString() +
                    "\n\n===========================================" +
                    "\n" + "----------- Workers information -----------\n" +
                    "===========================================\n\n";
            for (Worker w : workers) {
                projectDetails += w.toString() + "\n\n";
            }
            projectDetails += "Project Total: $%.2f\n";
            projectDetails += "Contractor Overhead: $%.2f\n";
            return projectDetails;
        }
}
