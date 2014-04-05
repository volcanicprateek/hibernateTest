// FourWheeler.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.dto;

import javax.persistence.Entity;

/**
 * 
 */
@Entity
public class FourWheeler extends Vehicle
{
    private String steeringWheel;

    /**
     * @return the steeringWheel
     */
    public String getSteeringWheel()
    {
        return steeringWheel;
    }

    /**
     * @param steeringWheel the steeringWheel to set
     */
    public void setSteeringWheel(final String steeringWheel)
    {
        this.steeringWheel = steeringWheel;
    }

}
