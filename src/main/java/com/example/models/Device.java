/*
 * ThingSpaceConnectivityManagementAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/05/2016
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Device 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4862456891340930179L;
    private String accountName;
    private String billingCycleEndDate;
    private List<CarrierInformation> carrierInformations;
    private Boolean connected;
    private String createdAt;
    private List<KvPair> customFields;
    private List<DeviceId> deviceIds;
    private List<KvPair> extendedAttributes;
    private List<String> groupNames;
    private String ipAddress;
    private String lastActivationBy;
    private String lastActivationDate;
    private String lastConnectionDate;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("accountName")
    public String getAccountName ( ) { 
        return this.accountName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("accountName")
    public void setAccountName (String value) { 
        this.accountName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("billingCycleEndDate")
    public String getBillingCycleEndDate ( ) { 
        return this.billingCycleEndDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("billingCycleEndDate")
    public void setBillingCycleEndDate (String value) { 
        this.billingCycleEndDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("carrierInformations")
    public List<CarrierInformation> getCarrierInformations ( ) { 
        return this.carrierInformations;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("carrierInformations")
    public void setCarrierInformations (List<CarrierInformation> value) { 
        this.carrierInformations = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("connected")
    public Boolean getConnected ( ) { 
        return this.connected;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("connected")
    public void setConnected (Boolean value) { 
        this.connected = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("createdAt")
    public String getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("createdAt")
    public void setCreatedAt (String value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("customFields")
    public List<KvPair> getCustomFields ( ) { 
        return this.customFields;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("customFields")
    public void setCustomFields (List<KvPair> value) { 
        this.customFields = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deviceIds")
    public List<DeviceId> getDeviceIds ( ) { 
        return this.deviceIds;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deviceIds")
    public void setDeviceIds (List<DeviceId> value) { 
        this.deviceIds = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("extendedAttributes")
    public List<KvPair> getExtendedAttributes ( ) { 
        return this.extendedAttributes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("extendedAttributes")
    public void setExtendedAttributes (List<KvPair> value) { 
        this.extendedAttributes = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("groupNames")
    public List<String> getGroupNames ( ) { 
        return this.groupNames;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("groupNames")
    public void setGroupNames (List<String> value) { 
        this.groupNames = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ipAddress")
    public String getIpAddress ( ) { 
        return this.ipAddress;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ipAddress")
    public void setIpAddress (String value) { 
        this.ipAddress = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("lastActivationBy")
    public String getLastActivationBy ( ) { 
        return this.lastActivationBy;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("lastActivationBy")
    public void setLastActivationBy (String value) { 
        this.lastActivationBy = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("lastActivationDate")
    public String getLastActivationDate ( ) { 
        return this.lastActivationDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("lastActivationDate")
    public void setLastActivationDate (String value) { 
        this.lastActivationDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("lastConnectionDate")
    public String getLastConnectionDate ( ) { 
        return this.lastConnectionDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("lastConnectionDate")
    public void setLastConnectionDate (String value) { 
        this.lastConnectionDate = value;
    }
 
}
 