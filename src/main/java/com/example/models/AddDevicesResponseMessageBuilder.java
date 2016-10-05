/*
 * ThingSpaceConnectivityManagementAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/05/2016
 */
package com.example.models;

import java.util.*;

public class AddDevicesResponseMessageBuilder {
    //the instance to build
    private AddDevicesResponseMessage addDevicesResponseMessage;

    /**
     * Default constructor to initialize the instance
     */
    public AddDevicesResponseMessageBuilder() {
        addDevicesResponseMessage = new AddDevicesResponseMessage();
    }

    public AddDevicesResponseMessageBuilder deviceIds(List<DeviceId> deviceIds) {
        addDevicesResponseMessage.setDeviceIds(deviceIds);
        return this;
    }

    public AddDevicesResponseMessageBuilder response(String response) {
        addDevicesResponseMessage.setResponse(response);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AddDevicesResponseMessage build() {
        return addDevicesResponseMessage;
    }
}