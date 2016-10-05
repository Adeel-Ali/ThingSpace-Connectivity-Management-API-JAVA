/*
 * ThingSpaceConnectivityManagementAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/05/2016
 */
package com.example.models;

import java.util.*;

public class CustomerNameBuilder {
    //the instance to build
    private CustomerName customerName;

    /**
     * Default constructor to initialize the instance
     */
    public CustomerNameBuilder() {
        customerName = new CustomerName();
    }

    public CustomerNameBuilder firstName(String firstName) {
        customerName.setFirstName(firstName);
        return this;
    }

    public CustomerNameBuilder lastName(String lastName) {
        customerName.setLastName(lastName);
        return this;
    }

    public CustomerNameBuilder middleName(String middleName) {
        customerName.setMiddleName(middleName);
        return this;
    }

    public CustomerNameBuilder title(String title) {
        customerName.setTitle(title);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CustomerName build() {
        return customerName;
    }
}