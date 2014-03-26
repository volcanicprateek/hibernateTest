// HibernateTest.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.hibernate;

import java.util.Date;

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
        userDetails.setJoinedDate(new Date());
        userDetails.setDescription("Nice decsription");

        final Address addr = new Address();
        addr.setCity("Jaipur");
        addr.setPincode("1212");
        addr.setStreet("adad");
        addr.setState("adadsda");

        userDetails.setHome_address(addr);
        userDetails.setOffice_address(addr);

        final UserDetails userDetails2 = new UserDetails();
        //userDetails2.setUserId(2);
        userDetails2.setUserName("SecondUsers");
        //userDetails2.setAddress("Avara Cadavara");
        userDetails2.setJoinedDate(new Date());
        userDetails2.setDescription("Nice decsription");

        final Address addr2 = new Address();
        addr2.setCity("Jaipur");
        addr2.setPincode("1212");
        addr2.setStreet("adad");
        addr2.setState("adadsda");

        userDetails2.setHome_address(addr2);
        userDetails2.setOffice_address(addr2);

        final Configuration configuration = new Configuration().configure();

        final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
                .build();
        final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);

        final Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(userDetails);
        session.save(userDetails2);

        session.getTransaction().commit();

        session.close();

    }
}
