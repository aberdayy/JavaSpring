package com.hibarnateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = 
				 new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			//HQL --> Hibernate Query Language
			//FROM City c WHERE c.countryCode='TUR' AND c.district='Ankara' OR c.countryCode='USA'
			//FROM City c WHERE c.name LIKE '%kar%' 
			//FROM City c ORDER BY c.name DESC 
			//List<City> cities = session.createQuery("select c.countryCode from City c GROUP BY c.countryCode ").getResultList();
			List<String> countryCodes = session.createQuery("select c.countryCode from City c GROUP BY c.countryCode ").getResultList();
 			
			for(String countryCode:countryCodes) {
				System.out.println(countryCode);
			}
			
			session.getTransaction().commit();
		}finally{
			factory.close();
		}
	}

}
