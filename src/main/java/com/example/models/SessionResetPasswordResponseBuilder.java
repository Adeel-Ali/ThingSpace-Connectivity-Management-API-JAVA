/*
 * ThingSpaceConnectivityManagementAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/05/2016
 */
package com.example.models;

import java.util.*;

public class SessionResetPasswordResponseBuilder {
    //the instance to build
    private SessionResetPasswordResponse sessionResetPasswordResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SessionResetPasswordResponseBuilder() {
        sessionResetPasswordResponse = new SessionResetPasswordResponse();
    }

    public SessionResetPasswordResponseBuilder newPassword(String newPassword) {
        sessionResetPasswordResponse.setNewPassword(newPassword);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SessionResetPasswordResponse build() {
        return sessionResetPasswordResponse;
    }
}