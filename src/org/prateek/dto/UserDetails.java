// UserDetails.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

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
    @JoinTable(name = "USER_ADDDRESS",
            joinColumns = @JoinColumn(name = "User_ID"))
    @GenericGenerator(name = "hilo-gen", strategy = "hilo")
    @CollectionId(columns = {
            @Column(name = "ADDRESS_ID")
    }, generator = "hilo-gen", type = @Type(type = "long"))
    private Collection<Address> listOfAddresses = new ArrayList();;

    /**
     * @return the listOfAddresses
     */
    public Collection<Address> getListOfAddresses()
    {
        return listOfAddresses;
    }

    /**
     * @param listOfAddresses the listOfAddresses to set
     */
    public void setListOfAddresses(final Collection<Address> listOfAddresses)
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
