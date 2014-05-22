// HibernateTest.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
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

        final Configuration configuration = new Configuration().configure();

        final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
                .build();
        final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);

        final Session session = sessionFactory.openSession();

        final Query query = session.getNamedQuery("UserDetails.byName");
        query.setString(0, "User2");

        final List<UserDetails> userNames = query.list();
        session.beginTransaction();

        session.getTransaction().commit();

        session.close();
        //System.out.println("Size is" + users.size());
        for (final UserDetails u : userNames)
        {
            System.out.println(u.getUserName());
        }

    }
}
