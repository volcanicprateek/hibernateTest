// UserDetails.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    @Temporal(TemporalType.DATE)
    private Date joinedDate;
    private String Address;
    private String description;

    /**
     * @return the joinedDate
     */
    public Date getJoinedDate()
    {
        return joinedDate;
    }

    /**
     * @param joinedDate the joinedDate to set
     */
    public void setJoinedDate(final Date joinedDate)
    {
        this.joinedDate = joinedDate;
    }

    /**
     * @return the address
     */
    public String getAddress()
    {
        return Address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(final String address)
    {
        Address = address;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(final String description)
    {
        this.description = description;
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
