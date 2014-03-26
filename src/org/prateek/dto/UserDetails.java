// UserDetails.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
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
    private String description;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "home_street")),
            @AttributeOverride(name = "city", column = @Column(name = "home_city")),
            @AttributeOverride(name = "pincode", column = @Column(name = "home_pincode")),
            @AttributeOverride(name = "state", column = @Column(name = "home_state"))
    })
    private Address home_address;
    @Embedded
    private Address office_address;

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
     * @return the home_address
     */
    public Address getHome_address()
    {
        return home_address;
    }

    /**
     * @param home_address the home_address to set
     */
    public void setHome_address(final Address home_address)
    {
        this.home_address = home_address;
    }

    /**
     * @return the office_address
     */
    public Address getOffice_address()
    {
        return office_address;
    }

    /**
     * @param office_address the office_address to set
     */
    public void setOffice_address(final Address office_address)
    {
        this.office_address = office_address;
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
