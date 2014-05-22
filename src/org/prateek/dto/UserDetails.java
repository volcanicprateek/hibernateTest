// UserDetails.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.SelectBeforeUpdate;

/**
 * 
 */
@Entity
@NamedQuery(name = "UserDetails.byId", query = "from UserDetails where userId > ? ")
@NamedNativeQuery(name = "UserDetails.byName", query = "select * from User_Details where userName = ?", resultClass = UserDetails.class)
@Table(name = "User_Details")
@SelectBeforeUpdate
public class UserDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;

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
