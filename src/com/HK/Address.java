package com.HK;

// Used to create an address object for either the worker or the location of the project
public class Address {

    // Check example in book - can all strings be written on one line?
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zip;


    public Address(String street1, String city, String state, String zip) {
        this.street1 = street1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Overloaded constructor for any address objects with a second street line
    public Address(String street1, String street2, String city, String state, String zip) {
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


    // Get back to this later to better understand whats happening

    @Override // The toString method is overridden to return the address in a formatted String
    public String toString() {
        if (street2 == null) return street1 + "\n" + city + ", " + state + " " + zip;
        else return street1 + "\n" + street2 + "\n" + city + ", " + state + " " + zip;
    }
}
