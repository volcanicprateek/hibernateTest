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
        final UserDetails userDetails = new UserDetails();
        //userDetails.setUserId(1);
        userDetails.setUserName("FirsUsers");
        //userDetails.setAddress("Avara Cadavara");

        final Address addr = new Address();
        addr.setCity("Jaipur");
        addr.setPincode("1212");
        addr.setStreet("adad");
        addr.setState("adadsda");

        final Address addr2 = new Address();
        addr2.setCity("Jaipur");
        addr2.setPincode("1212");
        addr2.setStreet("adad");
        addr2.setState("adadsda");

        userDetails.getListOfAddresses().add(addr);
        userDetails.getListOfAddresses().add(addr2);

        final Configuration configuration = new Configuration().configure();

        final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
                .build();
        final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);

        final Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(userDetails);

        session.getTransaction().commit();

        session.close();

    }
}
