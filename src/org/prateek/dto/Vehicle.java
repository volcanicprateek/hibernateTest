// Vehicale.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * 
 */
@Entity
public class Vehicle
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;
    private String vehicleName;
    @ManyToMany
    private Collection<UserDetails> users = new ArrayList();

    /**
     * @return the users
     */
    public Collection<UserDetails> getUsers()
    {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(final Collection<UserDetails> users)
    {
        this.users = users;
    }

    /**
     * @return the vehicleId
     */
    public int getVehicleId()
    {
        return vehicleId;
    }

    /**
     * @param vehicleId the vehicleId to set
     */
    public void setVehicleId(final int vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    /**
     * @return the vehicleName
     */
    public String getVehicleName()
    {
        return vehicleName;
    }

    /**
     * @param vehicleName the vehicleName to set
     */
    public void setVehicleName(final String vehicleName)
    {
        this.vehicleName = vehicleName;
    }
}
