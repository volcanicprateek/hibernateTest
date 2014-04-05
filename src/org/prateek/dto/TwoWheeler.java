// TwoWheeler.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.dto;

import javax.persistence.Entity;

/**
 * 
 */
@Entity
public class TwoWheeler extends Vehicle
{
    private String steeringHandle;

    /**
     * @return the steeringHandle
     */
    public String getSteeringHandle()
    {
        return steeringHandle;
    }

    /**
     * @param steeringHandle the steeringHandle to set
     */
    public void setSteeringHandle(final String steeringHandle)
    {
        this.steeringHandle = steeringHandle;
    }
}
