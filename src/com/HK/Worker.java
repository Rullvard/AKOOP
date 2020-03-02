package com.HK;


// This class will act as a superclass to the electrician, plumber and carpenter classes.
// Both the doWork() and the toString methods will be overridden in each subclass, these are examples of polymorphism.
public class Worker {

    public String fName;
    public String lName;
    public Address address;
    public int idNumber;
    public double hoursWorked;
    public double hourlyRate;
    // Get back to this function to understand how it works
    public String doWork() {
        return "Worker";
    }


    public Worker(String fName, String lName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.idNumber = idNumber;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override // The toString method is overridden to return the name and salary for each worker in a formatted String
    public String toString() {
        return fName + " " + lName + " \nCompensation: $"+calculatePay();
    }
}
