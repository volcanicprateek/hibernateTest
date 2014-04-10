// HibernateTest.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.prateek.dto.Address;
import org.prateek.dto.UserDetails;

/**
 * 
 */
public class HibernateTest
{

    /**
     * @param args
     */
    public static void main(final String[] args)
    {

        final UserDetails user = new UserDetails();
        user.setUserName("First User");

        final Address addr1 = new Address();
        addr1.setCity("Jaipur");
        addr1.setPincode("30203");
        addr1.setState("Rajashtan");
        addr1.setStreet("asdaa");

        final Address addr2 = new Address();
        addr2.setCity("Jaipur");
        addr2.setPincode("30212303");
        addr2.setState("Rajashtan");
        addr2.setStreet("asdaa");

        user.getListOfAddresses().add(addr1);
        user.getListOfAddresses().add(addr2);

        final Configuration configuration = new Configuration().configure();

        final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
                .build();
        final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.save(user);

        user.setUserName("Updated user");

        session.getTransaction().commit();

        session.close();

        session = sessionFactory.openSession();

        UserDetails new_user = null;
        new_user = (UserDetails) session.get(UserDetails.class, 1);

        System.out.println("Username is :" + new_user.getUserName());
        System.out.println(new_user.getListOfAddresses().size());

    }
}
