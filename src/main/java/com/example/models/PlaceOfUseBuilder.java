/*
 * ThingSpaceConnectivityManagementAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/05/2016
 */
package com.example.models;

import java.util.*;

public class PlaceOfUseBuilder {
    //the instance to build
    private PlaceOfUse placeOfUse;

    /**
     * Default constructor to initialize the instance
     */
    public PlaceOfUseBuilder() {
        placeOfUse = new PlaceOfUse();
    }

    public PlaceOfUseBuilder address(Address address) {
        placeOfUse.setAddress(address);
        return this;
    }

    public PlaceOfUseBuilder customerName(CustomerName customerName) {
        placeOfUse.setCustomerName(customerName);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PlaceOfUse build() {
        return placeOfUse;
    }
}