package com.HK;

public class Electrician extends Worker {
    private double wiringCost = 0.0;

    public Electrician(String fName, String lName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        super(fName, lName, address, idNumber, hoursWorked, hourlyRate);

    }

    public void setWiringCosts(double amount) {
        wiringCost = amount;
    }

    public String doWork() {
        return "Install electrical components";
    }

    @Override
    public String toString() {
        return "Electrician: " + super.toString() + "\n" + doWork();
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate + wiringCost;
    }
}
