/*
 * ThingSpaceConnectivityManagementAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/05/2016
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DeviceId 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5324630312013225643L;
    private String id;
    private String kind;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("kind")
    public String getKind ( ) { 
        return this.kind;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("kind")
    public void setKind (String value) { 
        this.kind = value;
    }
 
}
 