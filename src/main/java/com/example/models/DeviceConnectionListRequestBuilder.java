/*
 * ThingSpaceConnectivityManagementAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/05/2016
 */
package com.example.models;

import java.util.*;

public class DeviceConnectionListRequestBuilder {
    //the instance to build
    private DeviceConnectionListRequest deviceConnectionListRequest;

    /**
     * Default constructor to initialize the instance
     */
    public DeviceConnectionListRequestBuilder() {
        deviceConnectionListRequest = new DeviceConnectionListRequest();
    }

    public DeviceConnectionListRequestBuilder deviceId(DeviceId deviceId) {
        deviceConnectionListRequest.setDeviceId(deviceId);
        return this;
    }

    public DeviceConnectionListRequestBuilder earliest(String earliest) {
        deviceConnectionListRequest.setEarliest(earliest);
        return this;
    }

    public DeviceConnectionListRequestBuilder latest(String latest) {
        deviceConnectionListRequest.setLatest(latest);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeviceConnectionListRequest build() {
        return deviceConnectionListRequest;
    }
}