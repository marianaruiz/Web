/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.daos;

import controler.NewHibernateUtil;
import model.Alumno;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Mariana
 */
public class AlumnoDAO {
    public void create(Alumno a) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.getTransaction();
        try{
            tx.begin();
            session.persist(a);
            //session.save(a);
            tx.commit();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }
    
}
