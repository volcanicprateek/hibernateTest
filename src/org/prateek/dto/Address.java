// Address.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * 
 */
@Embeddable
public class Address
{
    private String street;
    @Column(name = "City_name")
    private String city;
    private String state;
    private String pincode;

    /**
     * @return the street
     */
    public String getStreet()
    {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(final String street)
    {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(final String city)
    {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState()
    {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(final String state)
    {
        this.state = state;
    }

    /**
     * @return the pincode
     */
    public String getPincode()
    {
        return pincode;
    }

    /**
     * @param pincode the pincode to set
     */
    public void setPincode(final String pincode)
    {
        this.pincode = pincode;
    }
}
