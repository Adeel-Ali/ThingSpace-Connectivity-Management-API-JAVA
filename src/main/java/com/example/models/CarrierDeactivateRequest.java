/*
 * ThingSpaceConnectivityManagementAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/05/2016
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CarrierDeactivateRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5155186684373680547L;
    private String accountName;
    private List<KvPair> customFields;
    private List<DeviceList> devices;
    private Boolean etfWaiver;
    private String groupName;
    private String reasonCode;
    private String servicePlan;
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
    @JsonGetter("devices")
    public List<DeviceList> getDevices ( ) { 
        return this.devices;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("devices")
    public void setDevices (List<DeviceList> value) { 
        this.devices = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("etfWaiver")
    public Boolean getEtfWaiver ( ) { 
        return this.etfWaiver;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("etfWaiver")
    public void setEtfWaiver (Boolean value) { 
        this.etfWaiver = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("groupName")
    public String getGroupName ( ) { 
        return this.groupName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("groupName")
    public void setGroupName (String value) { 
        this.groupName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("reasonCode")
    public String getReasonCode ( ) { 
        return this.reasonCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("reasonCode")
    public void setReasonCode (String value) { 
        this.reasonCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("servicePlan")
    public String getServicePlan ( ) { 
        return this.servicePlan;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("servicePlan")
    public void setServicePlan (String value) { 
        this.servicePlan = value;
    }
 
}
 