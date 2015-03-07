/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Mariana
 */
public class NewHibernateUtil {

    private static final SessionFactory sessionFactory;
    
     static{
	        try {
	            // Create the SessionFactory from hibernate.cfg.xml
	            Configuration configuration = new Configuration();
	            configuration.configure();
	            //apply configuration property settings to StandardServiceRegistryBuilder
	            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	        }
	        catch (Throwable ex) {
	            // Make sure you log the exception, as it might be swallowed
	            System.err.println("Error al crear sessionFactory" + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	     
	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	
}
