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
        final Query query = session.createQuery("from UserDetails user where user.userId = 1");
        query.setCacheable(true);

        final List<UserDetails> users = query.list();

        session.beginTransaction();

        session.getTransaction().commit();

        session.close();

        final Session session1 = sessionFactory.openSession();
        final Query query1 = session1.createQuery("from UserDetails user where user.userId = 1");
        query1.setCacheable(true);

        final List<UserDetails> users1 = query1.list();

        session1.beginTransaction();

        session1.getTransaction().commit();

        session1.close();

    }
}
