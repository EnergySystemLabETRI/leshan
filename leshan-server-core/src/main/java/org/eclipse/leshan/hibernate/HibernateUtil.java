package org.eclipse.leshan.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	   private static SessionFactory instance = null;

	   public static SessionFactory getInstance() {
		   
	      if(instance == null) {
			 
			 instance =  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			 
	      }
	      return instance;
	   }
	   
	   public static Session getSession(){
		         return HibernateUtil.getInstance().openSession();
		   }
	   
}
