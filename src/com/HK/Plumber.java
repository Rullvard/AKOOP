package com.HK;

public class Plumber extends Worker {
    private double plumbingMaterials = 0;

    public Plumber(String fName, String lName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        super(fName, lName, address, idNumber, hoursWorked, hourlyRate);
    }

    public void setPlumbingCost(double amount) {
        plumbingMaterials = amount;
    }

    public String doWork() {
        return "Install plumbing";
    }

    @Override
    public String toString() {
        return "Plumber: " + super.toString() + "\n" + doWork();
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate + plumbingMaterials;
    }
}
