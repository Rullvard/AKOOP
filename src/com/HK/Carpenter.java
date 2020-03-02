package com.HK;

// The Carpenter class extends the Worker class, which enables it to use the public attributes of the Worker class
public class Carpenter extends Worker {

    private double lumberCost;
    public Carpenter(String fName, String lName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        // This statement uses the Worker constructor to initialize the name, address, id number, hours and rate
        super(fName, lName, address, idNumber, hoursWorked, hourlyRate);
    }

    public void setLumberCost(double amount) {
        lumberCost = amount;
    }

    // The doWork() method is overridden, this is allowing the Carpenter to do specific carpentry work
    public String doWork() {
        return "Complete carpentry work";
    }

    @Override
    // The toString method is overridden to return the Carpenter information in a formatted String
    public String toString() {
        return "Carpenter: " + super.toString() + "\n" + doWork();
    }

    // Since the Carpenter might have additional lumberCost, the calculate pay is also overridden
    public double calculatePay() {
        return hoursWorked * hourlyRate + lumberCost;
    }
}
