// HibernateTest.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.prateek.dto.FourWheeler;
import org.prateek.dto.TwoWheeler;
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

        final Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("Car");

        final TwoWheeler bike = new TwoWheeler();
        bike.setVehicleName("Bike");
        bike.setSteeringHandle("Steering handle");

        final FourWheeler car = new FourWheeler();
        car.setSteeringWheel("Steering wheel");
        car.setVehicleName("Porche");

        final Configuration configuration = new Configuration().configure();

        final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
                .build();
        final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);

        final Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(vehicle);
        session.save(bike);
        session.save(car);

        session.getTransaction().commit();

        session.close();

    }
}
