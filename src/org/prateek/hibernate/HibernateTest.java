// HibernateTest.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.prateek.dto.UserDetails;
import org.prateek.dto.Vehicle;

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

        final Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("Car");

        final Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicleName("Truck");

        userDetails.getVehicle().add(vehicle);
        userDetails.getVehicle().add(vehicle1);

        final Configuration configuration = new Configuration().configure();

        final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
                .build();
        final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);

        final Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.persist(userDetails);

        session.getTransaction().commit();

        session.close();

    }
}
