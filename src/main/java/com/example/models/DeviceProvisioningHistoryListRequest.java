/*
 * ThingSpaceConnectivityManagementAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/05/2016
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DeviceProvisioningHistoryListRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5059334142563395609L;
    private DeviceId deviceId;
    private String earliest;
    private String latest;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deviceId")
    public DeviceId getDeviceId ( ) { 
        return this.deviceId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deviceId")
    public void setDeviceId (DeviceId value) { 
        this.deviceId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("earliest")
    public String getEarliest ( ) { 
        return this.earliest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("earliest")
    public void setEarliest (String value) { 
        this.earliest = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("latest")
    public String getLatest ( ) { 
        return this.latest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("latest")
    public void setLatest (String value) { 
        this.latest = value;
    }
 
}
 