/*
 * ThingSpaceConnectivityManagementAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/05/2016
 */
package com.example.models;

import java.util.*;

public class LeadInformationResponseBuilder {
    //the instance to build
    private LeadInformationResponse leadInformationResponse;

    /**
     * Default constructor to initialize the instance
     */
    public LeadInformationResponseBuilder() {
        leadInformationResponse = new LeadInformationResponse();
    }

    public LeadInformationResponseBuilder hasMoreData(Boolean hasMoreData) {
        leadInformationResponse.setHasMoreData(hasMoreData);
        return this;
    }

    public LeadInformationResponseBuilder leads(List<LeadResponse> leads) {
        leadInformationResponse.setLeads(leads);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public LeadInformationResponse build() {
        return leadInformationResponse;
    }
}