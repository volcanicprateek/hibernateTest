// UserDetails.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "USER_DETAILS")
public class UserDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    @ElementCollection
    private Set<Address> listOfAddresses = new HashSet();;

    /**
     * @return the listOfAddresses
     */
    public Set<Address> getListOfAddresses()
    {
        return listOfAddresses;
    }

    /**
     * @param listOfAddresses the listOfAddresses to set
     */
    public void setListOfAddresses(final Set<Address> listOfAddresses)
    {
        this.listOfAddresses = listOfAddresses;
    }

    /**
     * @return the userId
     */
    public int getUserId()
    {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(final int userId)
    {
        this.userId = userId;
    }

    /**
     * @return the userName
     */

    public String getUserName()
    {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(final String userName)
    {
        this.userName = userName;
    }

}
