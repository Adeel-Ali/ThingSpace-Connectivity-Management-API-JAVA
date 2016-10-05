/*
 * ThingSpaceConnectivityManagementAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/05/2016
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Address 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5162385545327272470L;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String country;
    private String state;
    private String zip;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("addressLine1")
    public String getAddressLine1 ( ) { 
        return this.addressLine1;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("addressLine1")
    public void setAddressLine1 (String value) { 
        this.addressLine1 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("addressLine2")
    public String getAddressLine2 ( ) { 
        return this.addressLine2;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("addressLine2")
    public void setAddressLine2 (String value) { 
        this.addressLine2 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("city")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("city")
    public void setCity (String value) { 
        this.city = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("state")
    public String getState ( ) { 
        return this.state;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("state")
    public void setState (String value) { 
        this.state = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("zip")
    public String getZip ( ) { 
        return this.zip;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("zip")
    public void setZip (String value) { 
        this.zip = value;
    }
 
}
 