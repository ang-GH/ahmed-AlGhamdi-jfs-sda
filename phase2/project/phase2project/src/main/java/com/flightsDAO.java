package com;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class flightsDAO {

	public void store(flightsList flight) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		System.out.println(flight.getfPrice());
		session.save(flight);
		tx.commit();
		session.close();
		factory.close();
	}

	public List<flightsList> showFlights() {

		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		TypedQuery q = session.createQuery("select u from com.flightsList u", flightsList.class);

		List<flightsList> flights = q.getResultList();

		session.close();
		factory.close();

		return flights;

	}
	
	public flightsList getFlightInfo(int id) {
		
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		TypedQuery q = session.createQuery("select u from com.flightsList u", flightsList.class);

		List<flightsList> flights = q.getResultList();
		
		flightsList fi = new flightsList();
		
		for(flightsList e : flights) {
			if(e.getfId()==id) {
				fi=e;
			}
		}
		

		session.close();
		factory.close();

		return fi;
	}
	

}
