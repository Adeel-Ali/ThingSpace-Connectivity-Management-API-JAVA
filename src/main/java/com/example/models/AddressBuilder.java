/*
 * ThingSpaceConnectivityManagementAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/05/2016
 */
package com.example.models;

import java.util.*;

public class AddressBuilder {
    //the instance to build
    private Address address;

    /**
     * Default constructor to initialize the instance
     */
    public AddressBuilder() {
        address = new Address();
    }

    public AddressBuilder addressLine1(String addressLine1) {
        address.setAddressLine1(addressLine1);
        return this;
    }

    public AddressBuilder addressLine2(String addressLine2) {
        address.setAddressLine2(addressLine2);
        return this;
    }

    public AddressBuilder city(String city) {
        address.setCity(city);
        return this;
    }

    public AddressBuilder country(String country) {
        address.setCountry(country);
        return this;
    }

    public AddressBuilder state(String state) {
        address.setState(state);
        return this;
    }

    public AddressBuilder zip(String zip) {
        address.setZip(zip);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Address build() {
        return address;
    }
}